package com.example.Car1.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class Dao<T> {
    protected List<T> collections = new ArrayList<>() ;
    // FIXME: consider using StringBuilder for string concatenation
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
    // NOTE: this method is called frequently, keep it lightweight
    // FIXME: consider using StringBuilder for string concatenation
