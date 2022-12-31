package com.study.prospringstudy.apress.prospring5.ch3.bean_autowiring.over;

public class OverRide extends OverBase {

    @Override
    public void print() {
        super.print();
        System.out.println("OverRid");
    }
}
