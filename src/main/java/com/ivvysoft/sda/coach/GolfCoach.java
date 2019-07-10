package com.ivvysoft.sda.coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ivvysoft.sda.fs.FortuneService;

@Component
public class GolfCoach implements Coach{
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public GolfCoach() {
		System.out.println(">> GolfCoach: inside no-arg constructor");
	}
	
	@PostConstruct
	public void doMyStartStuff() {
		System.out.println(">> GolfCoach: inside doMyStartStuff method");
	}
	
	@PreDestroy
	public void doMyCleanStuff() {
		System.out.println(">> GolfCoach: inside doMyCleanStuff method");
	}

	@Override
	public String getDailyWorckout() {
		return "Practice your bar.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
