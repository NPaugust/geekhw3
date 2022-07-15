package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

            BankAccount bankAccount = new BankAccount();

            bankAccount.deposit(20000);

            while (true){ Thread.sleep(2000);
                try {
                    bankAccount.withDraw(6000);
                    System.out.println("You have withdrawn 6000 soms.");
                }catch (LimitException le){
                    System.out.println(le.message + le.remainingAmount);
                    try {
                        if (bankAccount.amount > 0)
                            System.out.println("You have: " + bankAccount.amount + " som");
                        bankAccount.withDraw((int) bankAccount.amount);
                        break;
                    } catch (LimitException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


