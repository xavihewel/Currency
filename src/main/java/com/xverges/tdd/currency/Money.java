package com.xverges.tdd.currency;

public class Money {
    protected float amount;

    protected boolean equals(Dollar other)
    {
        Money o = other;
        return amount == o.amount;
    }
}
