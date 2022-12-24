package com.study.prospringstudy.apress.prospring5.ch2.decoupled;

public class HelloWorldMessageProvider2 implements MessageProvider {
    @Override
    public String getMessage() {
        System.out.println("Hello World Provider 2");
        return "";
    }
}
