package com.company;

public class BankAccount {
    double amount;
    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount = amount + sum;
    }

    public void withDraw(int sum) throws LimitException{
        if(sum > amount){
            throw new LimitException("You are trying to withdraw more money than you have in your wallet." +
                    "You have in your wallet:"
                    + amount, sum);
        }
        else { amount = amount - sum;
        }
    }
}