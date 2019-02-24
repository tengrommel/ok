package com.teng.chapter05.funcdetails

object Detail02 {
  def main(args: Array[String]): Unit = {
    println(getSum2(1,1))
    println(getSum3(1,1))
  }

  // 如果写了return 返回值就不能不写
  def getSum(n1: Int, n2: Int): Int = {
    return n1+n2
  }
  def getSum2(n1: Int, n2: Int) {
    return n1+n2
  }
  def getSum3(n1: Int, n2: Int): Unit = {
    return n1+n2
  }
}
