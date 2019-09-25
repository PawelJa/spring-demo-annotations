package com.spring.entities.impl;

import com.spring.entities.Coach;
import com.spring.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

//    @Autowired
    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meter as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
