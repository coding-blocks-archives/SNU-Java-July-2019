package com.codingblocks;

public class Human {

    public int age;
    public String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
