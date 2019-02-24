package com.teng.chapter05.mylazy

object lazydemo {

  def sum(i: Int, i1: Int): Int = {
    println("sum 执行了")
    i + i1
  }

  def main(args: Array[String]): Unit = {
    lazy val res = sum(10, 20)
    println("--------")
    println("res=" + res)
  }
}
