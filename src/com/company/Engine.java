package com.company;

//        Engine Class
//        fields

//        String type
//        bool isOn
//        int fuel
//        methods
//        constructor
//        turnOn
//        turnOff

public class Engine {
    public String type;
    public boolean isOn;
    public int fuel;

    public Engine(String type, boolean isOn, int fuel) {
        this.type = type;
        this.isOn = isOn;
        this.fuel = fuel;
    }

    public void turnOn() {
    // if isOn is equal false then set isOn to true.
        //if (isOn == false;
        if (!isOn)
            isOn = true;
        else
            System.out.println("the engine is already running.");
    }

    public void turnOff() {
    // if isOn is equal to true then set to false.
        if (isOn)
            isOn = false;
        else
            System.out.println("the engine is off already.");
    }

}
