package com.teng.chapter05.funcdetails

object Details04 {

  def main(args: Array[String]): Unit = {
    println(sayOk())
  }

  def sayOk(name: String = "jack"): String = {
    return name + "ok"
  }
}
