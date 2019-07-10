package com.ivvysoft.sda;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ivvysoft.sda.coach.Coach;
import com.ivvysoft.sda.coach.SportConfig;

public class JavaConfigDemoApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach theCoach = (Coach) context.getBean("tennisCoach");
		
		System.out.println(theCoach.getDailyWorckout());
		System.out.println(theCoach.getDailyFortune());
//		System.out.println("email: "+theCoach.getEmail());
//		System.out.println("team: "+theCoach.getTeam());
		
		context.close();
	}
}
