package com.codingblocks.l1;

public class Func {
    public static void main(String[] args) {
        int a = 78;
        int b = 67;

        Func.swap(a, b);

        System.out.println(a);
        System.out.println(b);
    }

    public static void swap(int a, int b){
        int t = a;
        a = b;
        b = t;
    }
}
