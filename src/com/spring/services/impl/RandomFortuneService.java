package com.spring.services.impl;

import com.spring.services.FortuneService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of strings

    @Value("${foo.fortuneList}")
    private String[] data;
    // create a random number generator
    private Random random = new Random();

    @Override
    public String getFortune() {
        // pick a random string from the array
        return data[random.nextInt(data.length)];
    }
}
