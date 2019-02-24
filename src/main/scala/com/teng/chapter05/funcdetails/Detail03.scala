package com.teng.chapter05.funcdetails

object Detail03 {
  def main(args: Array[String]): Unit = {
    def f1(): Unit = { // ok private final
      println("f1")
    }
    def sayOk(): Unit = {
      println("main sayOk")
      def sayOk(): Unit = {
        println("sayok sayok")
      }
    }
    println("ok~~")
  }
  def sayOk(): Unit = {
    println("main sayOk")
  }
}
