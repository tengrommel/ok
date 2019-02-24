package com.teng.chapter05.exception

object scalathrow {
  def main(args: Array[String]): Unit = {
    try {
      test()
    }catch {
      case ex: Exception => println("捕获到异常" + ex.toString)
    } finally {
      println("对try中的资源的分配")
    }
    println("ok")
  }

  def test(): Nothing = {
    throw new Exception("异常出现")
  }
}
