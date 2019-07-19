package com.codingblocks.l1;

public class Client {
    public static void main(String[] args) {
        Human anuj = new Human("Anuj");
        anuj.age = 22;
        anuj.name = "Anuj Garg";

        System.out.println(anuj.age);
        System.out.println(anuj.name);
    }
}
