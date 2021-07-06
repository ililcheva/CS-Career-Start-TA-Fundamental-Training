package com.creditsuisse.bank;

public class SavingAccount extends Account {
    public SavingAccount() {
        super();
    }
    public SavingAccount(int balance) {
        super(balance);
    }
    @Override
    public void withdraw(int amount) throws BankingException {
        if(amount > super.getBalance()){
            throw new BankingException("You cannot overdrawn the account balance.");
        } else {
            super.withdraw(amount);
        }
    }
}
