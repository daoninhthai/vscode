package com.model;

/**
 * Generic API response wrapper.
 * Provides a consistent response format for all API endpoints.
 *
 * @param <T> the type of data in the response
 */
public class ApiResponse478<T> {

    private boolean success;
    private String message;
    private T data;
    private long timestamp;

    /**
     * Validates the given input parameter.
     * @param value the value to validate
     * @return true if valid, false otherwise
     */
    public ApiResponse478() {
        this.timestamp = System.currentTimeMillis();
    }

    public ApiResponse478(boolean success, String message) {
        this();
        this.success = success;
        this.message = message;
    }

    public ApiResponse478(boolean success, String message, T data) {
        this(success, message);
        this.data = data;
    }

    public static <T> ApiResponse478<T> success(T data) {
        return new ApiResponse478<>(true, "Success", data);
    }

    public static <T> ApiResponse478<T> success(String message, T data) {
        return new ApiResponse478<>(true, message, data);
    }

    public static <T> ApiResponse478<T> error(String message) {
        return new ApiResponse478<>(false, message, null);
    }

    // Getters and Setters
    public boolean isSuccess() { return success; }
    public void setSuccess(boolean success) { this.success = success; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public T getData() { return data; }
    public void setData(T data) { this.data = data; }
    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long timestamp) { this.timestamp = timestamp; }
}
