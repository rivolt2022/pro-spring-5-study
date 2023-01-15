package com.study.prospringstudy.apress.prospring5.ch5;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactory;

public class AgentMail {

    public static void main(String[] args) {

        //타겟
        Agent target = new Agent();

        //전후처리기
        ProxyFactory pf = new ProxyFactory();

        //디자인패턴
        //데코레이터 패턴
        AgentDecorator decorator = new AgentDecorator();

        pf.addAdvice(decorator);

        pf.setTarget(target);


        Agent proxy = (Agent) pf.getProxy();

        target.speak();
        System.out.println("___________________");
        proxy.speak();


    }
}
