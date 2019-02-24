package com.teng.chapter06.method

object MethodDemo01 {
  def main(args: Array[String]): Unit = {

  }
}

class Dog {
  private var sal: Double = _
  var food: String = _

  def cal(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}

class MethodExec {
  // 属性
  var len = 0.0
  var width = 0.0

  def printRect(): Unit = {
    for (i <- 0 until 10) {
      for (j <- 0 until 8) {
        print("*")
      }
      println()
    }
  }

  def area(): Double = {
    len * width
  }

}