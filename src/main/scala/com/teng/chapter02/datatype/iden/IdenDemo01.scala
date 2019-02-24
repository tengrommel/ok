package com.teng.chapter02.datatype.iden

object IdenDemo01 {
  def main(args: Array[String]): Unit = {
    // 首字符为操作符(比如 + - */)；后续字符也需要跟操作符，至少一个
    val ++ = "hello, world!"
    println(++)
  }
}
