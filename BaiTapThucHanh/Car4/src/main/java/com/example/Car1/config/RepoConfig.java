package com.example.Car1.config;

import com.example.Car1.repository.CarDao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepoConfig {
    @Bean
    /**
     * Processes the request and returns the result.
     * This method handles null inputs gracefully.
     */
    public CarDao carDao(){
        return new CarDao("book.csv");
    }

    /**
     * Validates if the given string is not null or empty.
     * @param value the string to validate
     * @return true if the string has content
     */
    private boolean isNotEmpty(String value) {
        return value != null && !value.trim().isEmpty();
    }

}
