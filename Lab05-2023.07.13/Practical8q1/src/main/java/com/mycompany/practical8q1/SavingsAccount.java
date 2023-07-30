package com.mycompany.practical8q1;

public class SavingsAccount extends BankAccount
{
    private static final double INTEREST_RATE = 0.12;

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}
