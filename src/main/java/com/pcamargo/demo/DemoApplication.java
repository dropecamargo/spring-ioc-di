package com.pcamargo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		System.out.println("\nIoc, dependency injection ----------------");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("myCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		System.out.println("\nSetter dependency injection ---------------- ");
		SoccerCoach scoach = context.getBean("mySoccerCoach", SoccerCoach.class);
		System.out.println(scoach.getDailyWorkout());
		System.out.println(scoach.getDailyFortune());
		System.out.println(scoach.getEmailAddress());
		System.out.println(scoach.getTeam());
		
		System.out.println("\nBean Scope ----------------");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
	
		boolean result = (theCoach == alphaCoach);
			
		System.out.println("Result compare object (Scopes): " + result);
		System.out.println("Memory location theCoach "	 + theCoach);
		System.out.println("Memory location theCoach " + alphaCoach);
		
		System.out.println("\nBean LifeCycle ----------------");
		Coach trackCoach = context.getBean("myTrackCoach", Coach.class);
		System.out.println(trackCoach.getDailyWorkout());
		
		context.close();
	}
}
