package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
        new AnnotationConfigApplicationContext(SportConfig.class);

        Coach thatSillyCoach = context.getBean("tennisCoach", Coach.class);
        System.out.println(thatSillyCoach.getDailyWorkout());
        System.out.println(thatSillyCoach.getDailyFortune());
        context.close();
    }
}