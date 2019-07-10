package com.ivvysoft.sda.coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ivvysoft.sda.fs.FortuneService;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("sadFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(">> TennisCoach: inside no-arg constructor");
	}
	
	@PostConstruct
	public void doMyStartStuff() {
		System.out.println(">> TennisCoach: inside doMyStartStuff method");
	}
	
	@PreDestroy
	public void doMyCleanStuff() {
		System.out.println(">> TennisCoach: inside doMyCleanStuff method");
	}

	@Override
	public String getDailyWorckout() {
		return "Practice your bachand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
