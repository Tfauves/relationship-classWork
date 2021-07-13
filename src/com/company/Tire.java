package com.company;

//        Tire Class
//        fields

//        int diameter
//        int pressure
//        methods
//        constructor
//        fill

public class Tire {
    public int diameter;
    public int pressure;

    public Tire(int diameter, int pressure) {
        this.diameter = diameter;
        this.pressure = pressure;
    }

    public void fill() {

    }
    public String toString() {
        return diameter + " " + " " + pressure;
    }
}
