package com.xverges.tdd.currency;

import org.junit.Test;

import static org.junit.Assert.*;

public class CurrencyTest {

    @Test
    public void Multiply(){
        assertEquals(Money.Dollar(5).Times(2), Money.Dollar(10));
    }

    @Test
    public void Equality(){
        assertEquals(Money.Euro(5), Money.Euro(5));
        assertEquals(Money.Dollar(5), Money.Dollar(5));
        assertNotEquals(Money.Dollar(3), Money.Dollar(6));
    }

    @Test
    public void Inequality(){
        assertNotEquals( Money.Dollar(2), Money.Euro(2));
    }

    @Test
    public void FactoryMethods()
    {
        assertEquals( Money.Dollar(1).Times(2), Money.Dollar(2));
    }
}
