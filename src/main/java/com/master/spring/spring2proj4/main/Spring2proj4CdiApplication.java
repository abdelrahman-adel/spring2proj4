package com.master.spring.spring2proj4.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = { "com.master.spring.spring2proj4.res" })
@Configuration
public class Spring2proj4CdiApplication {

//	private static Logger LOGGER = LoggerFactory.getLogger(Spring2proj4CdiApplication.class);

	/**
	 * Commented for maven build (two main methods in one application)
	 */
//	public static void main(String[] args) {
//		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
//				Spring2proj4CdiApplication.class)) {
//
//			SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);
//
//			LOGGER.info("{} - {}", someCdiBusiness, someCdiBusiness.getSomeCdiDao());
//		}
//	}

}
