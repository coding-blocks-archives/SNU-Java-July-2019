package com.codingblocks.l1;

public class Car {
    private int doors = 4;
    private int engines = 1;

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }

    public void start(){
        System.out.println("Start like a generic Car");
    }

    public void stop(){
        System.out.println("Stop like a generic Car");
    }
}
