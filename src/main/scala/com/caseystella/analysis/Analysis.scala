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
class Analysis extends Serializable {
  type Bigram = Tuple2[String, String]
  type ScoredBigram = Tuple2[Bigram, Double]
  type BigramCount = Tuple2[Bigram, Int]

  def mutualInformation(commands:RDD[String]) :RDD[ScoredBigram] =  {

    def calculate(p_xy:Double, p_x:Double, p_y:Double) : Double = {
      Math.log(p_xy / (p_x*p_y)) / Math.log(2)
    }

    val parser = new CLIParserDriver
    val commandsAsBigrams= commands.map( line => parser.toCommandBigrams(parser.getCommandTokens(parser.getSyntaxTree(line.toString))))
    val commandCounts = commandsAsBigrams.flatMap( (bigrams:List[Bigram] ) => bigrams.flatMap( (bigram:Bigram) => List(bigram._1)))
                                      .map( (command:String) => (command, 1))
                                      .reduceByKey( (x:Int, y:Int) => x + y)

    val commandCountsArr = commandCounts.collect()
    val commandCountsMap = Map(commandCountsArr:_*)
    val numCommands = commandCountsMap.foldLeft(0)( (acc, x) => acc + x._2)
    val bigramsWithoutEnds = commandsAsBigrams.flatMap( bigrams => bigrams.filter( (bigram:Bigram) => bigram._2 != "END"))
    val bigramCounts = bigramsWithoutEnds.map( (bigram:Bigram) => (bigram, 1))
                                         .reduceByKey( (x:Int, y:Int) => x + y)
    val totalNumBigrams = bigramsWithoutEnds.count()

    bigramCounts.map( (bigramCount:BigramCount) => (calculate(1.0*bigramCount._2/totalNumBigrams, 1.0*commandCountsMap(bigramCount._1._1)/numCommands, 1.0*commandCountsMap(bigramCount._1._2)/numCommands), bigramCount._1 ) )
                .sortByKey(false) //sort the value (it's the first in the pair)
                .map( (x:Tuple2[Double, Bigram]) => (x._2, x._1)) //now invert the order of the pair
  }
  def tfidf( commands : RDD[String]):RDD[ScoredBigram] = {
    val parser = new CLIParserDriver
    val commandsAsBigrams= commands.map( line => parser.toCommandBigrams(parser.getCommandTokens(parser.getSyntaxTree(line.toString))))
    val num_commands = commandsAsBigrams.count()

    // compute TF
    val frequencies = commandsAsBigrams.flatMap( bigrams => bigrams)
                                       .map( (b:Bigram) => (b, 1))
                                       .reduceByKey( (x:Int, y:Int) => x + y)
                                       .map( (x:Tuple2[Bigram, Int]) => (x._1, Math.log1p(1.0*x._2/num_commands) ))

    // compute IDF
    val idf = commandsAsBigrams.flatMap( (bigrams:List[Bigram]) => Set(bigrams: _*).toList.asInstanceOf[List[Bigram]])
                               .map( (b:Bigram) => (b, 1))
                               .reduceByKey( (x:Int, y:Int) => x + y)
                               .map((x:BigramCount) => (x._1, Math.log(1.0*num_commands/x._2)))
    val tfidf = frequencies.join(idf)
                           .map( (x:Tuple2[Bigram, Tuple2[Double, Double] ]) => (x._2._1*x._2._2, x._1))
                           .sortByKey(false)
                           .map( (x:Tuple2[Double, Bigram]) => (x._2, x._1))


    tfidf
  }

}
