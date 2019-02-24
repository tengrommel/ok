package com.teng.chapter05.funcdetails

object DetailParameter05 {
  def main(args: Array[String]): Unit = {
    mysqlCon()
    println("*" * 20)
    mysqlCon(user = "teng", pwd = "teng")
  }

  def mysqlCon(add: String = "localhost", port: Int = 3306, user: String = "root", pwd: String = "root"): Unit ={
    println("add=" + add)
    println("port=" + port)
    println("user=" + user)
    println("pwd=" + pwd)
  }
}
