package com.teng.chapter06.dogcase

object DogCaseTest {
  def main(args: Array[String]): Unit = {
    var dog = new Dog
    dog.name = "tomcat"
    dog.age = 2
    dog.weigth = 6
    println(dog.say())
  }
}

class Dog {
  var name = ""
  var age = 0
  var weigth = 0.0
  def say(): String = {
    "小狗的信息如下：name=" + this.name + "\t age=" + this.age + " weight=" + this.weigth
  }
}