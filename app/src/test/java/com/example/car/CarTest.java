package com.example.car;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    @Test
    public void getMake() {
        Car c = new Car("Honda");
        assertEquals("Honda", c.getMake());
    }

    void setMake() {
    }
}