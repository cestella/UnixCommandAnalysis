package com.caseystella.analysis

import org.scalatest.matchers.Matchers
import org.scalatest.FlatSpec

/**
 * Created by cstella on 2/14/14.
 */
class TestAnalysis  extends FlatSpec with Matchers {

  "The CLI" should "generate properly parse arguments" in {
    {
      val map = new CommonCommandsAnalysis().parseOptions(List("--master", "master", "--stop", "foo", "input", "output"))
      System.out.println(map)
      assert(map('input).equals("input"))
      assert(map('master).equals("master"))
      assert(map('output).equals("output"))
      assert(map('stop).equals("foo"))
      assert(map.contains('input))
      assert(map.contains('output))
      assert(map.contains('stop))
    }
    {
      val map = new CommonCommandsAnalysis().parseOptions(List("input", "output","--stop", "foo" ))
      System.out.println(map)
      assert(map('input).equals("input"))
      assert(map('output).equals("output"))
      assert(map('stop).equals("foo"))
      assert(map.contains('input))
      assert(map.contains('output))
      assert(map.contains('stop))
    }
  }

}
