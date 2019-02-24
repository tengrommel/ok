package com.teng.chapter05.exception

object scalaexpection {
  def main(args: Array[String]): Unit = {
    try {
      val r = 10/0
    } catch {
      case ex: ArithmeticException => println("捕获了除数为零的算数异常" + ex.toString)
      case ex: Exception => println("捕获了异常" + ex.toString)
    }
    finally {
      println("scala finally...")
    }
  }
}
