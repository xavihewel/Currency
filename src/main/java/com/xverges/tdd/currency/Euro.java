package com.xverges.tdd.currency;

public class Euro extends Money {

    public Euro(float amount) {
        this.amount = amount;
    }

    public Euro Times(float times) {
        return new Euro(times * amount);
    }
}
