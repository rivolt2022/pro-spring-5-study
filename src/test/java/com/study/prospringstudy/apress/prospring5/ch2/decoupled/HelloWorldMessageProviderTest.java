package com.study.prospringstudy.apress.prospring5.ch2.decoupled;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldMessageProviderTest {

    @Test
    public void instance() {
        MessageProvider messageProvider = new HelloWorldMessageProvider();
        MessageProvider messageProvider2 = new HelloWorldMessageProvider2();

        messageProvider.getMessage();
        messageProvider2.getMessage();

    }

}
