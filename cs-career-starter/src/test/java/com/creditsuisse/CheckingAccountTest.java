package com.creditsuisse;

import com.creditsuisse.bank.CheckingAccount;
import com.creditsuisse.bank.NonAvailableCurrencyException;
import org.junit.Before;
import org.junit.Test;

import java.util.Currency;

import static org.junit.Assert.assertEquals;

public class CheckingAccountTest {
    CheckingAccount acc;

    @Before
    public void setup(){
        acc = new CheckingAccount(100);
    }

    @Test
    public void testWithdrawFee() {
        acc.withdraw(48);
        assertEquals(50, acc.getBalance());

        acc.withdraw(14);
        assertEquals(35, acc.getBalance());
    }

    @Test
    public void testDepositEUR() {
        Currency eur = Currency.getInstance("EUR");
        acc.deposit(100, eur);
        assertEquals(189, acc.getBalance());
    }

    @Test(expected = NonAvailableCurrencyException.class)
    public void testDepositCHF(){
        Currency chf = Currency.getInstance("CHF");
        acc.deposit(100, chf);
    }

}
