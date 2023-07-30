package com.mycompany.practical8q1;

public class CheckingAccount extends BankAccount
{
    private static final double INTEREST_RATE = 0.02;

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}
