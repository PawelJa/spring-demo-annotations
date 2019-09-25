package com.spring;

import com.spring.entities.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        // load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        // check if they are the same
        System.out.println("\nPointing to the same object: " + (coach == alphaCoach));
        System.out.println("\nMemory location for coach: " + coach);
        System.out.println("\nMemory loaction for alphaOach: " + alphaCoach);

        // close the context
        context.close();
    }
}
