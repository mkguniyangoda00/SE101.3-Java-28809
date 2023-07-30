package com.mycompany.practical8q1;

public class Practical8q1 
{

    public static void main(String[] args) 
    {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setBalance(20000000); // 20 million
        double savingsInterest = savingsAccount.calculateInterest();

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setBalance(1000000); // 1 million
        double checkingInterest = checkingAccount.calculateInterest();

        System.out.println("Interest on Savings Account: " + savingsInterest);
        System.out.println("Interest on Checking Account: " + checkingInterest);
    }
}
