package com.study.prospringstudy.apress.prospring5.ch3.bean_autowiring.xml;

import com.study.prospringstudy.apress.prospring5.ch3.bean_autowiring.annotated.Singer;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by iuliana.cosmina on 2/22/17.
 */
public class DependsOnDemo {

	public static void main(String... args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/ch3/bean_autowiring/app-context-01.xml");
		ctx.refresh();

		Singer johnMayer = ctx.getBean("johnMayer", Singer.class);
		johnMayer.sing();

		ctx.close();
	}

}
