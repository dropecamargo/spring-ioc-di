package com.pcamargo.demo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}
	
	@Override
	public String getDailyFortune() {
		return this.getClass().getName() + " -> " + fortuneService.getFortune();
	}
	
	// Init method
	public void doMyStartStuff() {
		System.out.println("TrackCoach start method doMyStartStuff");
	}
	
	// Destroy method
	public void doMyDestroyStuff() {
		System.out.println("TrackCoach clean method doMyDestroyStuff");
	}
}
