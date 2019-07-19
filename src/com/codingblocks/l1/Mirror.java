package com.codingblocks.l1;

public class Mirror {
    public static void main(String[] args) {
        int n = 5;
        int row = 0;
        int mirror = 0;

        while (mirror < 2 * n - 1) {

            int clap = 0;
            while (clap < row + 1) {
                System.out.print("* ");
                clap++;
            }
            System.out.println();

            if (mirror < n-1){
                row++;
            } else {
                row--;
            }

            mirror++;
        }
    }
}
