package com.jayashree.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach coach = context.getBean("SillyCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(coach.getDailyWokout());
		
		System.out.println(coach.getFortune());
		//close the context
		context.close();

	}

}
