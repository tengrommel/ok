package com.teng.chapter01.vars

object VarDemo02 {
  def main(args: Array[String]): Unit = {
    var age = 10
    age = 30
    val num2 = 30
//    num2 = 40 报错
    val dog = new Dog
//    dog = new Dog
  }
}

class Dog {
  var age: Int = 0
  var name: String = ""
}
