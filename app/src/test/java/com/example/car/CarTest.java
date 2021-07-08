package com.example.car;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    @Test
    public void getMake() {
        Car c = new Car("Honda", "Blue", "SUV", "2021");
        assertEquals("Honda", c.getMake());
    }

    @Test
    public void getColor() {
        Car c = new Car("Honda", "Blue", "SUV", "2021");
        assertEquals("Blue", c.getColor());
    }

    @Test
    public void getSize() {
        Car c = new Car("Honda", "Blue", "SUV", "2021");
        assertEquals("SUV", c.getSize());
    }

    @Test
    public void getYear() {
        Car c = new Car("Honda", "Blue", "SUV", "2021");
        assertEquals("2021", c.getYear());

    }
}