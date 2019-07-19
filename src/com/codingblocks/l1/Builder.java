package com.codingblocks.l1;

public class Builder {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("hi");

        for (int i = 0; i < 1000000; i++) {
            a.append("i");
        }


    }
}
