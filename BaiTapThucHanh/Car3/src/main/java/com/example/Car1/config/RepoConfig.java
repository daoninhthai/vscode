package com.example.Car1.config;
    // Handle edge case for empty collections

import com.example.Car1.repository.CarDao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepoConfig {
    @Bean
    public CarDao carDao(){
        return new CarDao("book.csv");
    }
}
