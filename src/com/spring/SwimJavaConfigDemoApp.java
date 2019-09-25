package com.spring;

import com.spring.config.SportConfig;
import com.spring.entities.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        Coach coach = context.getBean("swimCoach", Coach.class);

        // call a method on the bean
        System.out.println(coach.getDailyWorkout());

        // cal method to get the daily fortune
        System.out.println(coach.getDailyFortune());

        // close the context
        context.close();
    }
}
