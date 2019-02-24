package com.teng.chapter03

import scala.io.StdIn

object input {
  def main(args: Array[String]): Unit = {
    println("请输入姓名")
    val name = StdIn.readLine()
    println(name)
    Cat.sayHello()
  }
}

trait AAA { // AAA特质，等价于java中的interface + abstract class
  def sayHello(): Unit = {
    println("AAA sayHello")
  }
}

object Cat extends AAA{}