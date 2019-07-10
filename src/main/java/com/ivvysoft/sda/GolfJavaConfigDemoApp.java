package com.ivvysoft.sda;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ivvysoft.sda.coach.Coach;
import com.ivvysoft.sda.coach.SportConfig;

public class GolfJavaConfigDemoApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach theCoach = (Coach) context.getBean("golfCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorckout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}
}
