package com.company;


//        Car Class
//        fields

//        Engine engine
//        String type = "Car"
//        bool isLand = True
//        bool isWater = False
//        bool isAir = False
//        bool isSpace = False
//        [Passenger] passengers
//        [Tire] tires
//        methods
//        constructor
//        turnOn
//        turnOff
//        addPassenger
//        removePassenger
//        addTire
//        removeTire
//        (optional) replaceTire

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
    public List<Passenger> passengers = new ArrayList<>();
    public List<Tire> tires = new ArrayList<>();

    public Car(Engine engine, String type, int maxPassengers) {

        super( engine, type, true, false, false, false, maxPassengers);
    }

    public void addTire(Tire newTire, int qty) {

        for (int i = 0; i < qty; i++) {
        tires.add(newTire);
        }

    }

    public void removeTire() {

    }

    public void replaceTire() {

    }



}
