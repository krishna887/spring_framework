package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
ApplicationContext context= new AnnotationConfigApplicationContext("org.example");
Student student1=(Student) context.getBean("student");
        System.out.println(student1);
    }
}