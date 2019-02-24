package com.teng.chapter05.recursive

object Exercise01 {
  def main(args: Array[String]): Unit = {
    println("fbn的结果是"+ fbn(7))
    println("结果是"+ f(7))
    println("桃子的个数是"+ peach(1))
  }

  // f(1) = 3 f(n) = 2*f(n-1) + 1
  def f(n:Int): Int = {
    if (n==1) {
      3
    } else {
      2 * f(n-1) - 1
    }
  }
  // 1、day = 10 桃子有1
  // 2、day = 9 桃子有（day10[1]+1）×2
  // 2、day = 8 桃子有 （day9[4] + 1）× 2

  def peach(day:Int): Int = {
    if (day == 10) {
      1
    } else {
      (peach(day+1)+1) * 2
    }
  }

  def fbn(n: Int): Int = {
    // 分析
    // 1、当n = 1结果为1
    // 2、当n = 2结果是1
    if (n==1 || n==2) {
      1
    } else {
      fbn(n-1)+fbn(n-2)
    }
  }
}
