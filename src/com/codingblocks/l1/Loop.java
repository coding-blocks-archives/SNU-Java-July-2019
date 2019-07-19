package com.codingblocks.l1;

public class Loop {
    public static void main(String[] args) {

//        int count = 10;
//
//        while (count > 0){
//            System.out.println("Welcome to CB");
//            count--;
//        }

        int n = 5;


        int row = 0;
        while (row < n) {

            int clap = 0;
            while (clap < row + 1) {
                System.out.print("* ");
                clap++;
            }
            System.out.println();

            row++;
        }
    }
}
