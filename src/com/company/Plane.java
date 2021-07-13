package com.company;

//        Plane Class
//        fields

//        Engine engine
//        String type = "Plane"
//        bool isLand = False
//        bool isWater = False
//        bool isAir = True
//        bool isSpace = False
//        [Passenger] passengers
//        [Tire] tires
//        bool isLanding
//        methods
//        constructor
//        turnOn
//        turnOff
//        addPassenger
//        removePassenger
//        toggleLanding
//        addTire
//        removeTire
//        (optional) replaceTire

import java.util.ArrayList;
import java.util.List;

public class Plane extends Vehicle {
    public List<Tire> planeTires = new ArrayList<>();

    public boolean isLanding;

    public Plane(Engine engine,  String type, int maxPassengers, boolean isLanding) {

        super(engine, type, false, false, true, false, maxPassengers);
        this.isLanding = isLanding;

    }

    public void toggleLanding() {

    }

    public void addTire(Tire newTire, int qty) {

        for (int i = 0; i < qty; i++) {
        planeTires.add(newTire);
        }

    }

    public void removeTire() {

    }

    public void replaceTire() {

    }



}
