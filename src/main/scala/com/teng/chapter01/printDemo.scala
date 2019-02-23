package com.teng.chapter01

object printDemo {
  def main(args: Array[String]): Unit = {
    var str1: String = "hello"
    var str2: String = "world!"
    println(str1+str2)
    var name: String = "tom"
    var age:Int = 10
    var sal:Float = 10.67f
    var height:Double = 180.15
    // 格式化输出
    printf("名字=%s 年龄是%d 薪水%f 身高%f", name, age, sal, height)
    println(s"个人信息如下： \n 名字$name \n年龄$age \n薪水$sal")
  }
}
