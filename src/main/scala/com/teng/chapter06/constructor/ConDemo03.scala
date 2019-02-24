package com.teng.chapter06.constructor

object ConDemo03 {
  def main(args: Array[String]): Unit = {
    val p1 = new Person("f")
  }
}

class Person(inName: String, inAge: Int) {
  var name: String = inName
  var age: Int = inAge
  age += 10
  println("~~~~~~~~~~~~")

  override def toString: String = {
    "name=" + name + "\t age=" + age
  }

  println("ok")
  println("age=" + age)

  def this(name: String) {
    // 辅助构造器，必须在第一行显式调用主构造器
    this("jack", 10)
    this.name = name
  }
}