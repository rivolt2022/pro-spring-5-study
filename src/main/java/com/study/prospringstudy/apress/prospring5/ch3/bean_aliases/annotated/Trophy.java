package com.study.prospringstudy.apress.prospring5.ch3.bean_aliases.annotated;

import org.springframework.core.annotation.AliasFor;

/**
 * Created by iuliana.cosmina on 2/19/17.
 */

@Award
public @interface Trophy {

	@AliasFor(annotation = Award.class, attribute = "value")
	String[] name() default {};
}
