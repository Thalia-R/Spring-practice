package com.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    // add new fields for email and team
    private String emailAddress;
    private String team;

    // create a no-arg constructor
    public CricketCoach(){
        System.out.println("Cricketcoach: inside no-arg constructor");
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Cricketcoach: inside setter method - setEmailsadress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Cricketcoach: inside setter method - setTeam");
        this.team = team;
    }

    // setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricketcoach: inside setter method - setFortune");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
