package com.caseystella.analysis

import org.apache.spark.scheduler.InputFormatInfo
import org.apache.spark.SparkContext
import org.apache.spark.deploy.SparkHadoopUtil

/**
 * Created by cstella on 2/14/14.
 */
object Driver {

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
  def main(args:Array[String]) = {
    def argv = args(0).split(' ')
    if(argv.length < 2) { println("Dunno: " + argv.toList + "\n" + usage); sys.exit(-1)}
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
    val tfidf = new Analysis().analyze( commands)
    tfidf.saveAsTextFile(optionMap('output))
  }
}
