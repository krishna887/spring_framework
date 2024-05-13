package org.example;

import org.example.context.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
//        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//        Student student1= (Student)context.getBean("student1");
//        System.out.println(student1);
//        Student student2=(Student) context.getBean("student2");
//        System.out.println(student2);
//ApplicationContext context1= new AnnotationConfigApplicationContext(ConfigurationFile.class);
//Student student3= (Student) context1.getBean("student3");
//        System.out.println(student3);
//ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//      Student student1= (Student)context.getBean("student");
//        System.out.println(student1);
ApplicationContext context= new AnnotationConfigApplicationContext(ConfigurationFile.class);
Student s= (Student) context.getBean("student");
        System.out.println(s);


    }
}