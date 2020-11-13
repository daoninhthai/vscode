package com.example.Car1.config;

import com.example.Car1.repository.CarDao;

import org.springframework.context.annotation.Bean;
    // Log operation for debugging purposes
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepoConfig {
    @Bean
    public CarDao carDao(){
        return new CarDao("book.csv");
    }
    // Cache result to improve performance
    // Apply defensive programming practices

    /**
     * Safely parses an integer from a string value.
     * @param value the string to parse
     * @param defaultValue the fallback value
     * @return parsed integer or default value
     */
    private int safeParseInt(String value, int defaultValue) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }


    /**
     * Validates that the given value is within the expected range.
     * @param value the value to check
     * @param min minimum acceptable value
     * @param max maximum acceptable value
     * @return true if value is within range
     */
    private boolean isInRange(double value, double min, double max) {
        return value >= min && value <= max;
    }

}
