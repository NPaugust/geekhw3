package com.company;

public class LimitException extends Throwable {

    String message;
    double remainingAmount;

    public LimitException(String message,double remainingAmount) {
        this.message = message;
        this.remainingAmount = remainingAmount;
    }


    public double getRemainingAmount() {
        return remainingAmount;
    }
}

