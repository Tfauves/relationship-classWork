package com.company;

//        you should be able to instantiate the following items
//        an electric and a gas engine
//        a Car with 4 tires and an engine
//        a Boat with an engine
//        a Plane with 6 tires (two tires on three points technically) and an engine

public class Main {

    public static void main(String[] args) {
	// write your code here

        Tire carTire = new Tire(33, 35);
        Tire planeTire = new Tire(40, 200);

        Car car01 = new Car(new Engine("V6", false, 0), "Audi A6", 4);
        car01.addTire(carTire, 4);

        Car car02 = new Car(new Engine("electric", false, 0), "tesla", 4);
        car02.addTire(carTire, 4);

        Boat boat01 = new Boat( new Engine("boat", false, 0), "pontoon", 12, 1000);

        Plane plane01 = new Plane(new Engine("jet", false, 0), "747", 524, false);
        plane01.addTire(planeTire, 6);

        System.out.println(car01);
        System.out.println(car02);
        System.out.println(boat01);
        System.out.println(plane01);
        System.out.println(car01.tires);
    }

}

