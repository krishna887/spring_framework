package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationFile {
    @Bean
    public  Student student1() {
        Student std = new Student();
        std.setName("Krishna");
        std.setRollNo(123);
        std.setEmail("krishna@gmail.com");
        return  std;
    }
}
