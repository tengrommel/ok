package com.teng.chapter05.recursive

object Demo01 {
  def main(args: Array[String]): Unit = {
    test(4)
  }
  def test(i: Int) {
    if (i > 2) {
      test(i - 1)
    }
    println("n=" + i)
  }

  def test2(i: Int) {
    if (i > 2){
      test2(i - 1)
    } else {
      println("n=" + i)
    }
  }
}
