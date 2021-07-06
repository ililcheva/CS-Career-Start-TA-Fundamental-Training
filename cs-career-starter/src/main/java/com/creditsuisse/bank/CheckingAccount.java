package com.creditsuisse.bank;

import java.util.Currency;

public class CheckingAccount extends Account implements CurrencyAccount {

    public static final double EUR_FX_RATE = 0.89;
    public static final double GBP_FX_RATE = 0.77;
    public static final double USD_FX_RATE = 1;

    public CheckingAccount() {
        super();
    }
    public CheckingAccount(int balance) {
        super(balance);
    }
    @Override
    public void withdraw(int amount) throws IllegalArgumentException {
        int percentFee = (int) Math.round(super.getBalance()*0.02);
        if(percentFee > 1){
            super.withdraw(amount + percentFee);
        } else {
            super.withdraw(amount + 1);
        }
    }

    @Override
    public void deposit(int amount, Currency currency) throws NonAvailableCurrencyException {
        double fxRate;
        switch(currency.getSymbol()) {
            case "EUR":
                fxRate = EUR_FX_RATE;
                break;
            case "GBP":
                fxRate = GBP_FX_RATE;
                break;
            case "USD":
                fxRate = USD_FX_RATE;
                break;
            default:
                throw new NonAvailableCurrencyException("You can only deposit EUR and GBP");
        }
        super.deposit((int) Math.round(amount * fxRate));
    }
}
