package com.codingblocks;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] nums = new int[5][4];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = s.nextInt();
            }
        }
    }
}
