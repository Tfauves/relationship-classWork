package com.company;

//        you should be able to instantiate the following items
//        an electric and a gas engine
//        a Car with 4 tires and an engine
//        a Boat with an engine
//        a Plane with 6 tires (two tires on three points technically) and an engine

public class Main {

    public static void main(String[] args) {
	// write your code here
        Engine carEngine = new Engine("V6", false, 0);
        Engine boatEngine  = new Engine("boat", false, 0);
        Engine planeEngine = new Engine("jet", false, 0);
        Engine electricEngine = new Engine("electric", false, 0);

        Tire carTire = new Tire(33, 35);
        Tire planeTire = new Tire(40, 200);

        Car car01 = new Car(carEngine, "Audi A6", 4);
        car01.addTire(carTire, 4);

        Car car02 = new Car(electricEngine, "tesla", 4);
        car02.addTire(carTire, 4);

        Boat boat01 = new Boat(boatEngine, "pontoon", 12, 1000);

        Plane plane01 = new Plane(planeEngine, "747", 524, false);
        plane01.addTire(planeTire, 6);

        System.out.println(car01);
        System.out.println(car02);
        System.out.println(boat01);
        System.out.println(plane01);
        System.out.println(car01.tires);
    }

}

