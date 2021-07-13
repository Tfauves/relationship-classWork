package com.company;

//        Boat Class
//        fields

//        Engine engine
//        String type = "Boat"
//        bool isLand = False
//        bool isWater = True
//        bool isAir = False
//        bool isSpace = False
//        [Passenger] passengers
//        Int maxLoad
//        methods
//        constructor
//        turnOn
//        turnOff
//        addPassenger
//        removePassenger

import java.util.ArrayList;
import java.util.List;

public class Boat extends Vehicle {
    public List<Passenger> passengers = new ArrayList<>();

    public int maxLoad;

    public Boat(Engine engine,  String type, int maxPassengers, int maxLoad) {

        super( engine, type, false, true, false, false, maxPassengers);
        this.maxLoad = maxLoad;
    }

}
