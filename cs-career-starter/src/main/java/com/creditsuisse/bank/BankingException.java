package com.creditsuisse.bank;

public class BankingException extends RuntimeException {
    public BankingException(String message) {
        super(message);
    }
}
