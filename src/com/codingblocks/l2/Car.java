package com.codingblocks.l2;

public class Car {
    public String name;
    public int doors;
    public boolean ABS;

    public void setName(String name) {
        this.name = name;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isABS() {
        return ABS;
    }

    public Car(String name, int doors) {
        this.name = name;
        this.doors = doors;
    }
}
