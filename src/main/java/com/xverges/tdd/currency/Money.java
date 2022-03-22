package com.xverges.tdd.currency;

import java.util.Objects;

public class Money {

    private int amount = 0;
    private String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money Times(int times) {
        return new Money(amount * times, currency);
    }

    public static Money Dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money Euro(int amount) {
        return new Money(amount, "EUR");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount && Objects.equals(currency, money.currency);
    }
}
