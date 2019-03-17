package com.superbank;

public class Checking extends Account {

    private String type = "Checking";


    public Checking () {
        super();
    }


    public String getType () {
        return this.type;
    }

    public double getInterest () {
        return 0.01;
    }

}
