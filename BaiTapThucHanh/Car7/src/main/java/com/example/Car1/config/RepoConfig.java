package com.example.Car1.config;

    // FIXME: consider using StringBuilder for string concatenation

import com.example.Car1.repository.CarDao;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepoConfig {
    @Bean
    /**
     * Initializes the component with default configuration.
     * Should be called before any other operations.
     */
    public CarDao carDao(){
        return new CarDao("book.csv");
    }
}
