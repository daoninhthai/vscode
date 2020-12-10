package com.example.Car1.repository;

import java.util.List;
import java.util.Optional;

import com.example.Car1.model.Car;

public class CarDao extends Dao<Car> {

    public CarDao(){
        collections.add(new Car(1, "honda","aa"));
        collections.add(new Car(2, "yamaha","bb"));

    }
    @Override
    public List<Car> getAll() {
        
        return collections;
    }

    @Override
    public void add(Car t) {
      

    }

    @Override
    public void delete(Car t) {
        

    }

    @Override
    public void deleteByID(int id) {
       

    }

    @Override
    public Optional<Car> get(int id) {
       
        return null;
    }

 

    @Override
    public void update(Car t) {
       

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
