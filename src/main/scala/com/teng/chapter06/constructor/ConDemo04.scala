package com.teng.chapter06.constructor

object ConDemo04 {
  def main(args: Array[String]): Unit = {
    val worker = new Worker("smith")
    worker.name // 不能访问 inName
    val worker2 = new Worker2("f")
    worker2.inName

    val worker3 = new Worker3("jack")
    worker3.inName = "f"
    println(worker3.inName)
  }
}

class Worker(inName: String) {
  var name = inName
}

// inName变成只读的私有属性
class Worker2(val inName: String) {
  var name = inName
}

// 一个私有的可读可写的属性
class Worker3(var inName: String) {
  var name = inName
}