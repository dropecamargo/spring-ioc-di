package com.pcamargo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("myCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		System.out.println("Setter dependency injection ----------------");
		SoccerCoach scoach = context.getBean("mySoccerCoach", SoccerCoach.class);
		System.out.println(scoach.getDailyWorkout());
		System.out.println(scoach.getDailyFortune());
		System.out.println(scoach.getEmailAddress());
		System.out.println(scoach.getTeam());
		
		context.close();
	}
}
