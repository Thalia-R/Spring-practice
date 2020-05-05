package com.springdemo;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }







    //    Returns random fortune from array
    //    String[] fortune = {"Today is your lucky day", "You can do it!", "Mindset is everything"};
    //    Random random = new Random();
    //    return fortune[random.nextInt(fortune.length)];
    //    }
}
