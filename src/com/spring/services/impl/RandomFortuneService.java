package com.spring.services.impl;

import com.spring.services.FortuneService;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of strings
    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligance is the mother of good luck",
            "The journey is the reward"
    };

    // create a random number generator
    private Random random = new Random();

    @Override
    public String getFortune() {
        // pick a random string from the array
        return data[random.nextInt(data.length)];
    }
}
