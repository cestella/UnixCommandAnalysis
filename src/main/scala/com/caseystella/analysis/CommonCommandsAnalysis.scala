package com.caseystella.analysis

import org.apache.spark.scheduler.InputFormatInfo
import org.apache.spark.SparkContext
import org.apache.spark.deploy.SparkHadoopUtil
import org.apache.spark.rdd.RDD
import org.apache.spark.SparkContext._
import com.caseystella.util.CLIParserDriver

/**
 * Created by cstella on 2/14/14.
 */
class CommonCommandsAnalysis {
    val usage =
      """
        |Usage: command_analysis [--stop stop] input output
      """.stripMargin

  type OptionMap = Map[Symbol, String]

  def parseOptions(argsList:List[String]) : OptionMap  = {
    def nextOption(map: OptionMap, list: List[String]) : OptionMap = {
      def isSwitch(s : String) = (s(0) == '-')
      list match {
        case Nil => map
        case "--stop" :: value :: tail => nextOption(map ++ Map('stop -> value.toString), tail)
        case "--master" :: value :: tail => nextOption(map ++ Map('master -> value.toString), tail)
        case string :: opt2 :: tail  => nextOption(map ++ Map('input -> string, 'output -> opt2), tail)
        case string :: Nil =>  nextOption(map ++ Map('output -> string), list.tail)
        case option :: tail =>  throw new RuntimeException("Unknown option " + option)
      }
    }
    nextOption(Map(),argsList)
  }


  def analyze( commands : RDD[String]):RDD[Tuple2[Tuple2[String, String], Double]] = {
    val parser = new CLIParserDriver
    val commandsAsBigrams= commands.map( line => parser.toCommandBigrams(parser.getCommandTokens(parser.getSyntaxTree(line.toString))))
    val num_commands = commandsAsBigrams.count()

    // compute TF
    val frequencies = commandsAsBigrams.flatMap( bigrams => bigrams)
                                       .map( (b:Tuple2[String, String]) => (b, 1))
                                       .reduceByKey( (x:Int, y:Int) => x + y)
                                       .map( (x:Tuple2[Tuple2[String, String], Int]) => (x._1, Math.log1p(1.0*x._2/num_commands) ))

    // compute IDF
    val idf = commandsAsBigrams.flatMap( (bigrams:List[Tuple2[String, String]]) => Set(bigrams: _*).toList.asInstanceOf[List[Tuple2[String, String]]])
                               .map( (b:Tuple2[String, String]) => (b, 1))
                               .reduceByKey( (x:Int, y:Int) => x + y)
                               .map((x:Tuple2[Tuple2[String, String], Int]) => (x._1, Math.log(1.0*num_commands/x._2)))
    val tfidf = frequencies.join(idf)
                           .map( (x:Tuple2[Tuple2[String, String], Tuple2[Double, Double] ]) => (x._1, x._2._1*x._2._2))


    tfidf
  }

  def main(argv:Array[String]) = {

    if(argv.length < 2) { println(usage); sys.exit(-1)}
    type OptionMap = Map[Symbol, Any]
    val argsList = argv.toList
    val optionMap = parseOptions(argsList)
    val inputPath = optionMap('input)
    val conf = SparkHadoopUtil.get.newConfiguration()
    val sc = new SparkContext(optionMap('master), "SparkHdfsLR",
      System.getenv("SPARK_HOME"), SparkContext.jarOfClass(this.getClass), Map(),
      InputFormatInfo.computePreferredLocations(
        Seq(new InputFormatInfo(conf, classOf[org.apache.hadoop.mapred.TextInputFormat], inputPath))
      ))
    val commands = sc.textFile(optionMap('input))
    val tfidf = analyze( commands)
    tfidf.saveAsTextFile(optionMap('output))

  }
}
