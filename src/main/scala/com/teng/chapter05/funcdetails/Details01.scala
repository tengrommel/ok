package com.teng.chapter05.funcdetails

object Details01 {
  def main(args: Array[String]): Unit = {
    val tiger = new Tiger
    val tiger2 = test01(10, tiger)
    println(tiger2.name)
    println(tiger.name)
    println(tiger.hashCode() + " " + tiger2.hashCode())
  }

  def test01(n1: Int, tiger: Tiger): Tiger = {
    println("n1=" + n1)
    tiger.name = "jack"
    tiger
  }
}

class Tiger {
  var name = ""
}
