package com.teng.chapter05.func

object FunDemo01 {
  def main(args: Array[String]): Unit = {
    val n1 = 10
    val n2 = 20
    println("res=" + getRes(1, 2, '0'))
    println("res=" + getRes(n1, n2, '0'))
  }

  def getRes(n1: Int, n2: Int, oper:Char) = {
    if (oper == '+') {
      n1 + n2
    } else if (oper == '-') {
      n1 - n2
    } else {
      null
    }
  }
}
