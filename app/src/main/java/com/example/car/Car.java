package com.example.car;

public class Car {
    private String make;
    private String color;
    private String size;
    private String year;

    public Car(String make, String color, String size, String year){
        this.make = make;
        this.color = color;
        this.size = size;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setColor(String make) {
        this.color = color;
    }

    public void setSize(String make) {
        this.size = size;
    }

    public void setYear(String make) {
        this.year = year;
    }
}

