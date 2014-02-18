package com.caseystella.analysis

import org.scalatest.matchers.Matchers
import org.scalatest.FlatSpec

/**
 * Created by cstella on 2/14/14.
 */
class TestDriver  extends FlatSpec with Matchers {

  "The CLI" should "generate properly parse arguments" in {
    {
      val map = Driver.parseOptions(List("--master", "master", "--stop", "foo", "--algo", "g_2", "input", "output"))
      System.out.println(map)
      assert(map('input).equals("input"))
      assert(map('master).equals("master"))
      assert(map('output).equals("output"))
      assert(map('stop).equals("foo"))
      assert(map('algo).equals("g_2"))
      assert(map.contains('input))
      assert(map.contains('output))
      assert(map.contains('stop))
    }
    {
      val map = Driver.parseOptions(List("input", "output","--stop", "foo" ))
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
