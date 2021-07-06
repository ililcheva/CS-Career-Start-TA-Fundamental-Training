package com.creditsuisse;


import com.creditsuisse.bank.BankingException;
import com.creditsuisse.bank.SavingAccount;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SavingAccountTest {
    SavingAccount acc;

    @Before
    public void setup(){
        acc = new SavingAccount(100);
    }

    @Test(expected = BankingException.class)
    public void testWithdrawOverdrawn() {
        acc.withdraw(160);
        assertEquals(100, acc.getBalance());
    }

}
