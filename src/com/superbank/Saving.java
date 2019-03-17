package com.superbank;

public class Saving extends Account {

    private String type = "Savings";


    public Saving() {
        super();
    }


    public String getType () {
        return this.type;
    }

    public double getInterest () {
        return 0.04;
    }

}
