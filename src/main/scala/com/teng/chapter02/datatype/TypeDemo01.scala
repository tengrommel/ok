package com.teng.chapter02.datatype

object TypeDemo01 {
  def main(args: Array[String]): Unit = {
    var num1: Int = 10
    // 一切都是对象
    println(num1.toDouble + "\t" + num1.toString + 100.toString)
    var isPass = true
    println(isPass.toString)
    sayHi()
  }
  def sayHi(): Unit = {
    println("sayHi")
  }
}
