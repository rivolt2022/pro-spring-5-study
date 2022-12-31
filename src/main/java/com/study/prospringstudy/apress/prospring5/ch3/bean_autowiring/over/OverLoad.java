package com.study.prospringstudy.apress.prospring5.ch3.bean_autowiring.over;

/**
 * 오버로딩
 */
public class OverLoad {

   public OverLoad(String x, String y) {};

   public OverLoad(String x){}

    public void print(String x) {

    }

    public void print(String x, String y) {

    }

    public void print(String x, String y, String z) {

    }

}
