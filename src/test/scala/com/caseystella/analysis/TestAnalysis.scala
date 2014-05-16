package com.caseystella.analysis


import org.scalatest.BeforeAndAfterAll
import org.scalatest.FunSuite

import org.apache.spark.SparkContext
import com.caseystella.spark.util.LocalSparkContext

class TestAnalysis extends FunSuite with LocalSparkContext {

  test("Test Simple Command Set -- g_2") {
    val commands = List("ls -l | grep blah", "ls | history | sort | uniq -c", "ls -l | grep foo")
    /*
     *  P(Bigrams): (ls, grep) == 2/5
     *            , (history, sort) = 1/5
     *            , (sort, uniq) = 1/5
     *            , (ls, history) = 1/5
     *  P(Command): ls = 3/8
     *            , grep = 2/8
     *            , history = 1/8
     *            , sort = 1/8
     *            , uniq = 1/8
     *
     *  MI = (ls, grep) = log_2( (2/5) / ((3/8)* (2/8))) == 2.0931
     *     , (history, sort) = log_2( (1/6) / ( (1/8) * (1/8))) == 3.6781
     *     , (sort, uniq) == 3.6781
     *     , (ls, history) == 3.6781
     */
    val commandsRdd = sc.makeRDD(commands, 2)
    assert(commandsRdd.collect().toList == commands);

    val scoredBigrams = new Analysis().g_2(commandsRdd)
    val collectedBigrams = scoredBigrams.collect().toList
    System.out.println(collectedBigrams)
    assert( collectedBigrams.size == 4)
  }

  test("Test Simple Command Set -- MI") {
    val commands = List("ls -l | grep blah", "ls | history | sort | uniq -c", "ls -l | grep foo")
    /*
     *  P(Bigrams): (ls, grep) == 2/5
     *            , (history, sort) = 1/5
     *            , (sort, uniq) = 1/5
     *            , (ls, history) = 1/5
     *  P(Command): ls = 3/8
     *            , grep = 2/8
     *            , history = 1/8
     *            , sort = 1/8
     *            , uniq = 1/8
     *
     *  MI = (ls, grep) = log_2( (2/5) / ((3/8)* (2/8))) == 2.0931
     *     , (history, sort) = log_2( (1/6) / ( (1/8) * (1/8))) == 3.6781
     *     , (sort, uniq) == 3.6781
     *     , (ls, history) == 3.6781
     */
    val commandsRdd = sc.makeRDD(commands, 2)
    assert(commandsRdd.collect().toList == commands);

    val scoredBigrams = new Analysis().mutualInformation(commandsRdd)
    val collectedBigrams = scoredBigrams.collect().toList
    System.out.println(collectedBigrams)
    assert( collectedBigrams.size == 4)
  }

  test("Test Simple Command Set -- Raw Frequency") {
    val commands = List("ls -l | grep blah", "ls | history | sort | uniq -c", "ls -l | grep foo")
    /*
     *  P(Bigrams): (ls, grep) == 2/5
     *            , (history, sort) = 1/5
     *            , (sort, uniq) = 1/5
     *            , (ls, history) = 1/5
     */
    val commandsRdd = sc.makeRDD(commands, 2)
    assert(commandsRdd.collect().toList == commands);

    val scoredBigrams = new Analysis().rawFrequency(commandsRdd)
    val collectedBigrams = scoredBigrams.collect().toList
    System.out.println(collectedBigrams)
    assert( collectedBigrams.size == 4)
  }
}
