package com.study.prospringstudy.apress.prospring5.ch3.bean_autowiring.sandbox;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by iuliana.cosmina on 2/23/17.
 */
@Component
//Decomment the following annotation and comment the @Qualifier in the TrickyTarget class to test this annotation
//@Primary
public class FooImplOne implements Foo {

}
