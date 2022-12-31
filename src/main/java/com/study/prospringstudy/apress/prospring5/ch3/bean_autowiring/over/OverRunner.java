package com.study.prospringstudy.apress.prospring5.ch3.bean_autowiring.over;

public class OverRunner {

    public static void main(String[] args) {
        OverLoad overLoad1 = new OverLoad("x");
        OverLoad overLoad2 = new OverLoad("x", "y");

        OverBase override = new OverRide();

    }
}
