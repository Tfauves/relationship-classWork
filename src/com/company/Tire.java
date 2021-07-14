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
    public int maxPressure;
    public int currentPressure;
    public int minPressure;

    public Tire(int diameter, int maxPressure, int minPressure, int currentPressure) {
        this.diameter = diameter;
        this.maxPressure = maxPressure;
        this.minPressure = minPressure;
        this.currentPressure = currentPressure;
    }
    public void fill() {
        int bleedOff = 20;
      if (currentPressure < minPressure) {
          System.out.println("Tire pressure is low");
          currentPressure += maxPressure - bleedOff;
          System.out.println("The tire has been refilled the current pressure is " + currentPressure);
      }
      else {
          System.out.println("Current tire pressure is " + currentPressure + " Please do not over inflate.");
      }

    }
    public String toString() {
        return diameter + " " + " " + currentPressure;
    }
}
