package com.example.demo.exceptions;

public class InvalidEnumValueException extends RuntimeException {
    public InvalidEnumValueException(String message) {
        super(message);
    }
}
