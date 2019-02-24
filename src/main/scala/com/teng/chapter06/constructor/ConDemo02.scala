package com.teng.chapter06.constructor

object ConDemo02 {
  def main(args: Array[String]): Unit = {
    val a = new AA("jack")
  }
}

class BB {
  println("b~~~")
}

class AA extends BB {
  def this(name: String){
    this
    println(s"A this(name:String) $name")
  }
}
