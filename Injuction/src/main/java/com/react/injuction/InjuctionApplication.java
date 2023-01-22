package com.react.injuction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class InjuctionApplication {

	public static void main(String[] args) {
		//SpringApplication.run(InjuctionApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		StudentDetails data = (StudentDetails) context.getBean("StudentData");
		
		data.Display();
	}

}
