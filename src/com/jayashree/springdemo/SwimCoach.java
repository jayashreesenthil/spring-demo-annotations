package com.jayashree.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

		private FortuneService fortuneservice;
		
		@Value("${foo.email}")
		private String email;
		
		@Value("${foo.team}")
		private String team;
		
	public SwimCoach(FortuneService thefortuneservice) {
			fortuneservice = thefortuneservice;
		}

	@Override
	public String getDailyWokout() {
		return "Swim 1000 meters as a warm up";
	}

	@Override
	public String getFortune() {
		return fortuneservice.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
}
