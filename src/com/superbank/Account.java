package com.superbank;

public class Account {

    private int number;
    private static int counter = 0;
    private double balance;
    private String type = "Generic";
    private double interest = 0.00;

    Account () {
        counter++;
        this.number = counter;
    }


    public int getNumber () {
        return this.number;
    }

    public double getInterest () {
        return this.interest;
    }

    public double getBalance () {
        return this.balance;
    }

    public String getType () {
        return this.type;
    }



    public void credit (double amount) {
        this.balance += amount;
    }

    public void debit (double amount) {
        if (amount < this.getBalance()) {
            this.balance -= amount;
        }
    }

    public String getInfo () {
        return "\t#" + this.getNumber() + " (" + this.getType() + ") " + "Balance: $" + this.getBalance() + " [" + this.getInterest() + " interest rate]";
    }


}
