package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationcontext.xml");

            Coach theCoach = context.getBean("tennisCoach", Coach.class);
            Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
            boolean result = (theCoach == alphaCoach);
            System.out.println(result);
            context.close();


    }
}