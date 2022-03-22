package com.jayashree.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		
		//call a method on the bean
		System.out.println(coach.getDailyWokout());
		
		System.out.println(coach.getFortune());
		
		//call our new swim coach methods... has the props values injected
		System.out.println("Email: "+coach.getEmail());
		System.out.println("Team: "+coach.getTeam());
		
		//close the context
		context.close();

	}

}
