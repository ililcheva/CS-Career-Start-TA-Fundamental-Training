package com.creditsuisse.bank;

public class Account {
    private int number;
    private int balance;

    public Account(){
        this.balance = 0;
    }
    public Account(int balance){
        this.balance = balance;
    }
    public void deposit(int amount) throws IllegalArgumentException {
        if(amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative: " + amount);
        }
        this.balance += amount;
    }

    public void withdraw(int amount) throws IllegalArgumentException {
        if(amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative: " + amount);
        }
        this.balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int amount) {
        this.balance = amount;
    }
}
