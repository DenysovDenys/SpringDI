package com.company.config;


import com.company.model.Car;
import com.company.model.User;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.company")
public class Config {

    @Bean
    public User users(){
        return new User("Denys","Denysov", 26);
    }

    @Bean
    public Car car(){
        return new Car(users(),"Ford", "Mustang", 2020);
    }
}