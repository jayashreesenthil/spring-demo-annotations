package com.jayashree.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("SillyCoach")		//Bean ID - SillyCoach
@Component
//@Scope("Prototype")
public class TennisCoach implements Coach {

	//field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneservice;
	
	//default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	//define init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
	}
	//define destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
	}
	/*// define the setter method
	@Autowired
	public void setFortuneservice(FortuneService thefortuneservice) {
		System.out.println(">> TennisCoach: inside setFortuneservice() method");
		fortuneservice = thefortuneservice;
	}
	*/
	/*/Constructor Injection
	@Autowired
	public TennisCoach(FortuneService thefortuneservice) {
		fortuneservice = thefortuneservice;
	}
	*/
	/*/Method Injection
	@Autowired
	public void doSomeCrazyStuff(FortuneService thefortuneservice) {
		fortuneservice = thefortuneservice;
	}
	*/
	
	@Override
	public String getDailyWokout() {
		
		return "Pactice your backhand volley";
	}

	
	@Override
	public String getFortune() {
		
		return fortuneservice.getFortune();
	}

}
