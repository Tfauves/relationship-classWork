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
    public List<Passenger> passengersList = new ArrayList<>();

    public String type;
    public boolean isLand;
    public boolean isWater;
    public boolean isAir;
    public boolean isSpace;
    public int maxPassengers;

    public Vehicle(Engine engine, String type, boolean isLand, boolean isWater, boolean isAir, boolean isSpace, int maxPassengers) {

        this.engine = engine;
        this.type = type;
        this.isLand = isLand;
        this.isWater = isWater;
        this.isAir = isAir;
        this.isSpace = isSpace;
        this.maxPassengers = maxPassengers;
    }

    public void turnOn() {
        engine.turnOn();
    }

    public void turnOff() {
        engine.turnOff();
    }

    public void addPassenger(String name, int weight) {
        Passenger passenger = new Passenger(name, weight);

        if (passengersList.size() < maxPassengers)
            passengersList.add(passenger);

        if (passengersList.size() >= maxPassengers)
            System.out.println("The max amount of passengers is " + maxPassengers + " no more passengers may be added.");

    }

    public void removePassenger() {
        if (passengersList.size() > 0)
            passengersList.remove(0);
    }

    public String toString() {

        return engine.type + " " + type + " " + "max passengers " + maxPassengers;
    }


}
