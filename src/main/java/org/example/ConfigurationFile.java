package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationFile {
    @Bean
    public  Student student1() {

        return new Student("krishna","kpchaulagain@gmail.com",123,address());
    }
@Bean
    public Address address() {
    return new Address("Kathmandu",12,"Jorpati");
    }
}
