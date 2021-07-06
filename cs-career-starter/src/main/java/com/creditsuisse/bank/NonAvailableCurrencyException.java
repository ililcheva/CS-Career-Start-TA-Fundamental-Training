package com.creditsuisse.bank;

public class NonAvailableCurrencyException extends RuntimeException {
    public NonAvailableCurrencyException(String message) {
        super(message);
    }
}
