package com.teng.chapter01.vars

object VarDemo02 {
  def main(args: Array[String]): Unit = {
    var age = 10
    age = 30
    val num2 = 30
//    num2 = 40 报错
    // val 没有线程安全问题，因此效率高，scala的设计推荐我们使用val
    val dog = new Dog
//    dog = new Dog
    dog.age = 90
    dog.name = "小花"
  }
}

class Dog {
  var age: Int = 0
  var name: String = ""
}
