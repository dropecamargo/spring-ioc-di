/**
 * 
 */
package com.pcamargo.demo;

/**
 * @author @dropecamargo
 *
 */
public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// Dependency Injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return this.getClass().getName() + " -> " + fortuneService.getFortune();
	}
}
