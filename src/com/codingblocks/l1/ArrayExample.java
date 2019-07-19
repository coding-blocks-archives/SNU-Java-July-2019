package com.codingblocks.l1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Integer[] nums = new Integer[5];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }


        System.out.println(Arrays.toString(nums));

    }
}
