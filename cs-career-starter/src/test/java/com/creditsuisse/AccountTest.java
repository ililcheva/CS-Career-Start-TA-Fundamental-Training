package com.creditsuisse;

import com.creditsuisse.bank.Account;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    Account acc;

    @Before
    public void setup(){
        acc = new Account();
        acc.setBalance(100_000);
    }

    @Test
    public void testDeposit() throws IllegalAccessException {
        acc.deposit(100);
        assertEquals(100100, acc.getBalance());
    }

    @Test
    public void testWithdraw() throws IllegalAccessException {
        acc.withdraw(900);
        assertEquals(99100, acc.getBalance());
    }
}
