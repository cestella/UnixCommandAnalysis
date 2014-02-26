package com.caseystella.analysis

import org.apache.spark.scheduler.InputFormatInfo
import org.apache.spark.SparkContext
import org.apache.spark.deploy.SparkHadoopUtil
import org.apache.spark.rdd.RDD
import org.apache.spark.SparkContext._
import com.caseystella.util.CLIParserDriver
import org.apache.mahout.math.stats.LogLikelihood

/**
 * Analysis implements routines to rank pairs of consecutive commands using Spark.
 * The approaches implemented here:
 *   * raw frequency
 *   * G_2 log likelihood metric
 *   * scaled pointwise mutual information
 */
class Analysis extends Serializable {
  type Bigram = Tuple2[String, String]
  type ScoredBigram = Tuple2[Bigram, Double]
  type BigramCount = Tuple2[Bigram, Int]

  /**
   * Returns a RDD with a scored bigram based on frequency of consecutive commands.
   * @param commands an RDD containing Strings of commands
   * @return An RDD of ScoredBigram sorted by score
   */
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


  /**
   * Returns a RDD with a scored bigram based on pointwise mutual information scaled by frequency of consecutive commands.
   * @param commands an RDD containing Strings of commands
   * @return An RDD of ScoredBigram sorted by score
   */
  def mutualInformation(commands:RDD[String]) :RDD[ScoredBigram] =  {

    /**
     * Scaled pointwise mutual information:
     *  log_2(P(xy)) * log_2( P(xy) / P(x)*P(y) )
     * @param p_xy P(xy)
     * @param p_x P(x)
     * @param p_y P(y)
     * @return scaled pointwise mutual information
     */
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

  /**
   * Returns a RDD with a scored bigram based on the G^2 statistical test as popularized in
   * Dunning, Ted (1993). Accurate Methods for the Statistics of Surprise and Coincidence, Computational Linguistics, Volume 19, issue 1 (March, 1993).
   * @param commands an RDD containing Strings of commands
   * @return An RDD of ScoredBigram sorted by score
   */
  def g_2(commands:RDD[String]) :RDD[ScoredBigram] =  {

    /**
     * Returns the G^2 score given command counts
     * @param p_xy The count of commands x and y consecutively
     * @param p_x The count of command x
     * @param p_y The count of command y
     * @param numCommands The total number of commands
     * @return The G^2 score
     */
    def calculate(p_xy:Long, p_x:Long, p_y:Long, numCommands:Long) : Double = {
      val k11= p_xy // count of x and y together
      val k12= (p_x - p_xy) //count of x without y
      val k21= (p_y - p_xy) // count of y without x
      val k22= numCommands- (p_x + p_y - p_xy) //count of neither x nor y

      LogLikelihood.logLikelihoodRatio(k11.asInstanceOf[Long], k12.asInstanceOf[Long], k21.asInstanceOf[Long], k22.asInstanceOf[Long])
    }

    val parser = new CLIParserDriver
    // Convert the commands to lists of command pairs
    val commandsAsBigrams= commands.map( line => parser.toCommandBigrams(parser.getCommandTokens(parser.getSyntaxTree(line.toString))))

    /*
     * Count the individual commands
     */
    // Count the number of commands that are not END, a special end command
    // This is essentially command count
    val commandCounts = commandsAsBigrams.flatMap( (bigrams:List[Bigram] ) => bigrams.flatMap( (bigram:Bigram) => List(bigram._1, bigram._2)).filter(x => x != "END"))
                                         .map( (command:String) => (command, 1))
                                         .reduceByKey( (x:Int, y:Int) => x + y)
    // Collect the array of command to count pairs locally into an array
    val commandCountsArr = commandCounts.collect()
    // Create a Map from those pairs
    val commandCountsMap = Map(commandCountsArr:_*)
    //Count the values of command map to get the total number of commands
    val numCommands = commandCountsMap.foldLeft(0)( (acc, x) => acc + x._2)

    /*
     * Count the bigrams
     */
    val bigramsWithoutEnds = commandsAsBigrams.flatMap( bigrams => bigrams.filter( (bigram:Bigram) => bigram._2 != "END"))
    val bigramCounts = bigramsWithoutEnds.map( (bigram:Bigram) => (bigram, 1) )
                                         .reduceByKey( (x:Int, y:Int) => x + y)
    val totalNumBigrams = bigramsWithoutEnds.count()

    /*
     * Score the bigrams using the individual command count map and the bigram count RDD
     */
    bigramCounts.map( (bigramCount:BigramCount) => (calculate( bigramCount._2 // The count of the pair of commands
                                                             , commandCountsMap(bigramCount._1._1) // The count of the first command in the pair
                                                             , commandCountsMap(bigramCount._1._2) // The count of the second command in the pair
                                                             , numCommands // the total number of commands
                                                             )
                                                   , bigramCount._1 // the pair of commands
                                                   )
                    )
                .sortByKey(false) //sort the value (it's the first in the pair)
                .map( (x:Tuple2[Double, Bigram]) => (x._2, x._1)) //now invert the order of the pair
  }
}
