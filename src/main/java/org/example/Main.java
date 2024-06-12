package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
//    public static void main(String[] args) {
//ApplicationContext context= new AnnotationConfigApplicationContext("org.example");
//Student student1=(Student) context.getBean("student");
//        System.out.println(student1);
//    }
public static void main(String[] args) {
    ApplicationContext context=new AnnotationConfigApplicationContext("org.example");
    ApplicationContext context1=new AnnotationConfigApplicationContext("org.example");
//    System.out.println(context1);
//    System.out.println(context);
      Demo d1=  context.getBean("demo", Demo.class);
    Demo d2=  context1.getBean("demo", Demo.class);

    System.out.println(d1 +"  "+ d2);



//  SingletonScope s1=  context.getBean("singletonScope", SingletonScope.class);
//  SingletonScope s2= context.getBean("singletonScope", SingletonScope.class);
// PrototypeScope prototypeScope =s1.getPrototypeScope();
// PrototypeScope prototypeScope1= s2.getPrototypeScope();
//    System.out.println(prototypeScope1);
//    System.out.println(prototypeScope);

//  var bean1= context.getBean("demo");
//  var bean2= context.getBean("demo");

//    System.out.println(bean1+ " "+ bean2);

//    // using SpelExpressionParser Api:
//    SpelExpressionParser temp= new SpelExpressionParser();
//    Expression exp=temp.parseExpression("22+11");
//    System.out.println(exp);

}
}