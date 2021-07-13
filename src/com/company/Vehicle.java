package com.company;

//    Vehicle Class
//Fields
//        Engine engine
//        String type
//        bool isLand
//        bool isWater
//        bool isAir
//        bool isSpace
//        [Passenger] passengers
//        Int maxPassengers

//        methods
//        constructor
//        turnOn
//        turnOff
//        addPassenger
//        removePassenger

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    public Engine engine;
    public List<Passenger> passengers = new ArrayList<>();

    public String type;
    public boolean isLand;
    public boolean isWater;
    public boolean isAir;
    public boolean isSpace;
    public int maxPassengers;

    public Vehicle(Engine engine,  String type, boolean isLand, boolean isWater, boolean isAir, boolean isSpace, int maxPassengers) {

        this.engine = engine;
        this.type = type;
        this.isLand = isLand;
        this.isWater = isWater;
        this.isAir = isAir;
        this.isSpace = isSpace;
        this.maxPassengers = maxPassengers;
    }

    public void turnOn() {

    }

    public void turnOff() {

    }

    public void addPassenger() {

    }

    public void removePassenger() {

    }

    public String toString() {

        return engine.type + " " + type + " " + "max passengers " + maxPassengers;
    }

}
