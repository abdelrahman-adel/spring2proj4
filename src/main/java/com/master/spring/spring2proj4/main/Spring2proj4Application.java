package com.master.spring.spring2proj4.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.master.spring.spring2proj4.res.BinarySearchImpl;

@ComponentScan(basePackages = { "com.master.spring.spring2proj4.res" })
@Configuration
public class Spring2proj4Application {

	private static Logger LOGGER = LoggerFactory.getLogger(Spring2proj4Application.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring2proj4Application.class);

		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);

		int result1 = binarySearchImpl.binarySearch(new int[] { 1, 2, 3 }, 2);
		LOGGER.info("result: {}", result1);

	}

}
