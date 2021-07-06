package com.creditsuisse.bank;

public class Demo {
    public static void main(String[] args) throws IllegalAccessException {
        Account acc = new Account();
        System.out.println("\nPlease create account with 100 CHF initial balance?");
        acc.setBalance(100);
        System.out.println("Balance at account creation: " + acc.getBalance());
        System.out.println("\nPlease deposit 1000 CHF?");
        acc.deposit(1000);
        System.out.println("Balance after 1st deposit: " + acc.getBalance());
        System.out.println("\nPlease withdraw 100 CHF?");
        acc.withdraw(100);
        System.out.println("Balance after 1st withdrawal: " + acc.getBalance());
    }
}
