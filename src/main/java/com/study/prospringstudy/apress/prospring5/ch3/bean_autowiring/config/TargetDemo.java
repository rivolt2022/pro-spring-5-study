package com.study.prospringstudy.apress.prospring5.ch3.bean_autowiring.config;

import com.study.prospringstudy.apress.prospring5.ch3.bean_autowiring.sandbox.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

/**
 * Created by iuliana.cosmina on 2/25/17.
 */
public class TargetDemo {

	@Configuration
	static class TargetConfig {

		@Bean
		public Foo fooImplOne() {
			return new FooImplOne();
		}

		@Bean
		public Foo fooImplTwo() {
			return new FooImplTwo();
		}

		@Bean
		public Bar bar() {
			return new Bar();
		}

		@Bean
		public TrickyTarget trickyTarget() {
			return new TrickyTarget();
		}
	}

	public static void main(String[] args) {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(TargetConfig.class);
		TrickyTarget t = ctx.getBean(TrickyTarget.class);
		ctx.close();
	}
}
