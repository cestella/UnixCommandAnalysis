package com.caseystella.analysis

import org.apache.spark.scheduler.InputFormatInfo
import org.apache.spark.SparkContext
import org.apache.spark.deploy.SparkHadoopUtil
import org.apache.spark.rdd.RDD
import org.apache.spark.SparkContext._
import com.caseystella.util.CLIParserDriver
import org.apache.mahout.math.stats.LogLikelihood

/**
 * Created by cstella on 2/14/14.
 */
class Analysis extends Serializable {
  type Bigram = Tuple2[String, String]
  type ScoredBigram = Tuple2[Bigram, Double]
  type BigramCount = Tuple2[Bigram, Int]

  def rawFrequency(commands:RDD[String]) :RDD[ScoredBigram] =  {
    val parser = new CLIParserDriver
    val commandsAsBigrams= commands.map( line => parser.toCommandBigrams(parser.getCommandTokens(parser.getSyntaxTree(line.toString))))

    val bigramsWithoutEnds = commandsAsBigrams.flatMap( bigrams => bigrams.filter( (bigram:Bigram) => bigram._2 != "END"))
    val bigramCounts = bigramsWithoutEnds.map( (bigram:Bigram) => (bigram, 1))
                                         .reduceByKey( (x:Int, y:Int) => x + y)
    val totalNumBigrams = bigramsWithoutEnds.count()

    bigramCounts.map( (bigramCount:BigramCount) => (1.0*bigramCount._2/totalNumBigrams, bigramCount._1 ) )
                .sortByKey(false) //sort the value (it's the first in the pair)
                .map( (x:Tuple2[Double, Bigram]) => (x._2, x._1)) //now invert the order of the pair
  }

  def mutualInformation(commands:RDD[String]) :RDD[ScoredBigram] =  {

    def calculate(p_xy:Double, p_x:Double, p_y:Double) : Double = {
      (Math.log(p_xy)/Math.log(2)) * (Math.log(p_xy / (p_x*p_y)) / Math.log(2))
    }

    val parser = new CLIParserDriver
    val commandsAsBigrams= commands.map( line => parser.toCommandBigrams(parser.getCommandTokens(parser.getSyntaxTree(line.toString))))
    val commandCounts = commandsAsBigrams.flatMap( (bigrams:List[Bigram] ) => Set(bigrams.flatMap( (bigram:Bigram) => List(bigram._1, bigram._2)).filter(x => x != "END"):_*))
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

  def g_2(commands:RDD[String]) :RDD[ScoredBigram] =  {

    def calculate(p_xy:Long, p_x:Long, p_y:Long, numCommands:Long) : Double = {
      val k11= p_xy
      val k12= (p_x - p_xy)
      val k21= (p_y - p_xy)
      val k22= numCommands- (p_x + p_y - p_xy)
      if(k11 < 0 || k12 < 0 || k21 < 0 || k22 < 0)
      {
        val out = List(p_xy, p_x, p_y, k11, k12, k21, k22).toString
        throw new RuntimeException(out)
      }
      LogLikelihood.logLikelihoodRatio(k11.asInstanceOf[Long], k12.asInstanceOf[Long], k21.asInstanceOf[Long], k22.asInstanceOf[Long])
    }

    val parser = new CLIParserDriver
    val commandsAsBigrams= commands.map( line => parser.toCommandBigrams(parser.getCommandTokens(parser.getSyntaxTree(line.toString))))
    val commandCounts = commandsAsBigrams.flatMap( (bigrams:List[Bigram] ) => bigrams.flatMap( (bigram:Bigram) => List(bigram._1, bigram._2)).filter(x => x != "END"))
                                      .map( (command:String) => (command, 1))
                                      .reduceByKey( (x:Int, y:Int) => x + y)

    val commandCountsArr = commandCounts.collect()
    val commandCountsMap = Map(commandCountsArr:_*)
    val numCommands = commandCountsMap.foldLeft(0)( (acc, x) => acc + x._2)
    val bigramsWithoutEnds = commandsAsBigrams.flatMap( bigrams => bigrams.filter( (bigram:Bigram) => bigram._2 != "END"))
    val bigramCounts = bigramsWithoutEnds.map( (bigram:Bigram) => (bigram, 1) )
                                         .reduceByKey( (x:Int, y:Int) => x + y)
    val totalNumBigrams = bigramsWithoutEnds.count()

    bigramCounts.map( (bigramCount:BigramCount) => (calculate(bigramCount._2, commandCountsMap(bigramCount._1._1), commandCountsMap(bigramCount._1._2), numCommands), bigramCount._1 ) )
                .sortByKey(false) //sort the value (it's the first in the pair)
                .map( (x:Tuple2[Double, Bigram]) => (x._2, x._1)) //now invert the order of the pair
  }
}
