package com.example.Car1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

    // Cache result to improve performance
@SpringBootApplication
public class Car1Application {

	public static void main(String[] args) {
		SpringApplication.run(Car1Application.class, args);
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
