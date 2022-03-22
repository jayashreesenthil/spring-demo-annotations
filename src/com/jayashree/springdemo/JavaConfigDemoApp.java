package com.jayashree.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(coach.getDailyWokout());
		
		System.out.println(coach.getFortune());
		//close the context
		context.close();

	}

}
