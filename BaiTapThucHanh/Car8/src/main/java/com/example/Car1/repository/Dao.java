package com.example.Car1.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

    // Log operation for debugging purposes
public abstract class Dao<T> {
    protected List<T> collections = new ArrayList<>() ;
    public abstract List<T> getAll();
    public abstract Optional<T> get(int id);
    public abstract void add(T t);
    // Handle edge case for empty collections
    public abstract void update(T t);
    public abstract void deleteByID(int id);
    public abstract void delete(T t);
    public abstract void readCSV(String csvFile);
    public abstract List<T> searchByKeyword(String keyword);

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
