package com.codingblocks.l1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

//        double f = 6543678965435678654367867654678654675.0;
//        int a = 6575;
//        long l = 65478;
//
//
//        boolean first = true;
//        boolean second = false;
//
//        System.out.println(first || second);
//
        Scanner s= new Scanner(System.in);

        int year = s.nextInt();
        int second = s.nextInt();

        if (year % 4 == 0){
            System.out.println("leap year");
        } else {
            System.out.println("not leap");
        }


        System.out.println(year);
        System.out.println(second);

    }
}
