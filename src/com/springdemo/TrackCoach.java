package com.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(){

    }

    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }


    // add an init method
    public void doMyStartup(){
        System.out.println("TrackCoach:inside method doMyStartup");
    }

    // add a destroy method
    public void doMyCleanup(){
        System.out.println("TrackCoach: inside method doMyCleanup");
    }
}
