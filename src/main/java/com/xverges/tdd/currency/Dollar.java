package com.xverges.tdd.currency;

public class Dollar extends Money {

    public Dollar(float amount) {
        this.amount = amount;
    }

    public Dollar Times(float times) {
        return new Dollar(amount * times);
    }

}

//varias multiplicaciones
//dollar es value object
//no quremos exponer amount
//queremos euros
