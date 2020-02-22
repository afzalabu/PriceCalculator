package com.cts.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
@ComponentScan(basePackages="com.cts")
public class PriceCalculatorDemo {

	public static void main(String[] args) {

		SpringApplication.run(PriceCalculatorDemo.class, args);
		
	}
	
}
