package com.study.prospringstudy.apress.prospring5.ch2.decoupled;

public class HelloWorldMessageProvider implements MessageProvider {
     //생성자
    public HelloWorldMessageProvider(){
        System.out.println(" --> HelloWorldMessageProvider: constructor caled");
    }

    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
