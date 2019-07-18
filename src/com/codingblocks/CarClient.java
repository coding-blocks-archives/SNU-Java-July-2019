package com.codingblocks;

public class CarClient {
    public static void main(String[] args) {
        Maruti car = new Maruti();

        car.start();
        car.stop();
//        car.fly();
        System.out.println(car.doors);
        System.out.println(car.engines);
    }
}
