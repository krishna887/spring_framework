package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(ConfigurationFile.class);
       Student student1=(Student) context.getBean("student1");
        System.out.println(student1);

    }
}