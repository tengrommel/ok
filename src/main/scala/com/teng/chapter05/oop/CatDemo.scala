package com.teng.chapter05.oop

object CatDemo {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    // 给猫的属性赋值
    cat.name = "小白"
    cat.age = 10
    cat.color = "白色"
  }
}

class Cat {
  // 说明
  // 1、当我们声明了var name: String时，对应private name
  // 2、同时会生成两个public的方法 name() ==>类似getter name_$eq() ==>类似于setter
  var name: String = ""
  var age: Int = _
  var color: String = _
}