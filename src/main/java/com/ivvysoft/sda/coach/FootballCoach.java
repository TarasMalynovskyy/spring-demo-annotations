package com.ivvysoft.sda.coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ivvysoft.sda.fs.FortuneService;

@Component
public class FootballCoach implements Coach{
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	

	public FootballCoach() {
		System.out.println(">> FootballCoach: inside no-arg constructor");
	}
	
	@PostConstruct
	public void doMyStartStuff() {
		System.out.println(">> FootballCoach: inside doMyStartStuff method");
	}
	
	@PreDestroy
	public void doMyCleanStuff() {
		System.out.println(">> FootballCoach: inside doMyCleanStuff method");
	}

	@Override
	public String getDailyWorckout() {
		return "Run 15km every day!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
