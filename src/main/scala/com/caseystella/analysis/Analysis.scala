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
class Analysis {
  type Bigram = Tuple2[String, String]
  type ScoredBigram = Tuple2[Bigram, Double]

  def analyze( commands : RDD[String]):RDD[ScoredBigram] = {
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
                               .map((x:Tuple2[Bigram, Int]) => (x._1, Math.log(1.0*num_commands/x._2)))
    val tfidf = frequencies.join(idf)
                           .map( (x:Tuple2[Bigram, Tuple2[Double, Double] ]) => (x._2._1*x._2._2, x._1))
                           .sortByKey(false)
                           .map( (x:Tuple2[Double, Bigram]) => (x._2, x._1))


    tfidf
  }

}
