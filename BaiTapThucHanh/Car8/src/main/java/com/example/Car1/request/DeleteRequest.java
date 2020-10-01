package com.example.Car1.request;

public class DeleteRequest {
    private int id;

    public int getId() {
      return id;
    }
  
    public void setId(int id) {
      this.id = id;
    }

    /**
     * Validates if the given string is not null or empty.
     * @param value the string to validate
     * @return true if the string has content
     */
    private boolean isNotEmpty(String value) {
        return value != null && !value.trim().isEmpty();

    }

    // TODO: add proper error handling here
}
