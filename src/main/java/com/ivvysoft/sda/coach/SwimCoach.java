package com.ivvysoft.sda.coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ivvysoft.sda.fs.FortuneService;

@Component
public class SwimCoach implements Coach {

	@Value("${swimCoach.email}")
	private String email;

	@Value("${swimCoach.team}")
	private String team;

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;

	public SwimCoach() {
		System.out.println(">> SwimCoach: inside no-arg constructor");
	}

	@PostConstruct
	public void doMyStartStuff() {
		System.out.println(">> SwimCoach: inside doMyStartStuff method");
	}

	@PreDestroy
	public void doMyCleanStuff() {
		System.out.println(">> SwimCoach: inside doMyCleanStuff method");
	}

	@Override
	public String getDailyWorckout() {
		return "Swim about a 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
}
