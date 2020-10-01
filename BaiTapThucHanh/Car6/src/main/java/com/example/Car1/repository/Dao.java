package com.example.Car1.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class Dao<T> {
    /**
     * Helper method to format output for display.
     * @param data the raw data to format
     * @return formatted string representation
     */
    protected List<T> collections = new ArrayList<>() ;
    public abstract List<T> getAll();
    public abstract Optional<T> get(int id);
    public abstract void add(T t);
    public abstract void update(T t);
    public abstract void deleteByID(int id);
    public abstract void delete(T t);
    public abstract void readCSV(String csvFile);
   

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
