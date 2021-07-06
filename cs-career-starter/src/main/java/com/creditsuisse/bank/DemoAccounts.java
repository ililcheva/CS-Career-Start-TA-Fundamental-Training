package com.creditsuisse.bank;


import java.util.Currency;
import java.util.List;
import java.util.ArrayList;

public class DemoAccounts {
    public static void main(String[] args) throws BankingException {
        SavingAccount first = new SavingAccount();
        CheckingAccount second = new CheckingAccount();
        SavingAccount third = new SavingAccount();
        SavingAccount fourth = new SavingAccount();
        CheckingAccount fifth = new CheckingAccount();
        List<Account> accounts = new ArrayList<>();
        accounts.add(first);
        accounts.add(second);
        accounts.add(third);
        accounts.add(fourth);
        accounts.add(fifth);

        int counter = 1;
        for(Account acc: accounts){
            System.out.println(counter + " account initial balance: " + acc.getBalance());
            if(acc.getClass() == CheckingAccount.class) {
                ((CheckingAccount) acc).deposit(100, Currency.getInstance("EUR"));
            } else {

            }
            System.out.println(counter + " account after deposit balance: " + acc.getBalance());
            acc.withdraw(50);
            System.out.println(counter + " account after withdrawal balance: " + acc.getBalance());
            counter++;
        }

        fifth.deposit(100, Currency.getInstance("GBP"));
        System.out.println("Fifth acc newest balance is:" + fifth.getBalance());
    }


}
