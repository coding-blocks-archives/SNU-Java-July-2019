package com.codingblocks;

public class BothMirror {
    public static void main(String[] args) {
        int n = 5;
        int row = 0;
        int mirror = 0;

        while (mirror < 2 * n - 1) {

            int h_mir = 0;
            int col = 0;
            while (h_mir < 2 * n - 1) {
                if (col < row + 1) {
                    System.out.print(row + 1 +" ");
                } else {
                    System.out.print("  ");
                }
                if (h_mir < n - 1){
                    col++;
                } else {
                    col--;
                }
                h_mir++;
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
