package com.xverges.tdd.currency;

import org.junit.Test;

import static org.junit.Assert.*;

public class CurrencyTest {

    @Test
    public void Multiply(){
        Dollar sut = new Dollar(5);
        assertEquals(sut.Times(2), new Dollar(10));
    }

    @Test
    public void Equality(){
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(6));

        assertEquals(new Euro(5), new Euro(5));
        assertNotEquals(new Euro(5), new Euro(6));
    }

    @Test
    public void Inequality(){
        assertNotEquals( new Dollar(5), new Euro(5));
    }

    @Test
    public void MultiplyEuros(){
        Euro sut = new Euro(5);
        assertEquals(sut.Times(2), new Euro(10));
    }

    @Test
    public void METHOD(){
        Money sut = new Dollar(10);
        assertNotEquals(sut, new Euro(10));
    }

}
