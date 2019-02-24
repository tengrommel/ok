package com.teng.chapter02.datatype

object TypeDemo02 {
  def main(args: Array[String]): Unit = {

  }
  // 比如在开发中，我们有一个方法，就会异常中断，这时就可以返回Nothing
  // 即当我们Nothing做返回值，就是明确该方法没有正常返回值
  def sayHello: Nothing = {
    throw new Exception("抛出异常")
  }
}
