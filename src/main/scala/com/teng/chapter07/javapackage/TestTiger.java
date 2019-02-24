package com.teng.chapter07.javapackage;

public class TestTiger {
    public static void main(String[] args) {
        // 使用xm的Tiger
        com.teng.chapter07.javapackage.xm.Tiger tiger01 = new com.teng.chapter07.javapackage.xm.Tiger();
        com.teng.chapter07.javapackage.xh.Tiger tiger02 = new com.teng.chapter07.javapackage.xh.Tiger();
        // 使用xh的Tiger
        System.out.println(tiger01);
        System.out.println(tiger02);
    }
}
