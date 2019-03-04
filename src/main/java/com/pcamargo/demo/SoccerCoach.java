/**
 * 
 */
package com.pcamargo.demo;

/**
 * @author @dropecamargo
 *
 */
public class SoccerCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice corner kick 50 minuts";
	}
	
	@Override
	public String getDailyFortune() {
		return this.getClass().getName() + " -> " + fortuneService.getFortune();
	}

}
