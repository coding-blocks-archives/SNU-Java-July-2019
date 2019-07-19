package com.codingblocks.l2;

public class LCS {
    public static void main(String[] args) {
        String first = "aman";
        String second = "manan";

        System.out.println(lcs(first, second, first.length(), second.length()));
    }

    private static int lcs(String first, String second, int f_len, int s_len) {

        if (f_len == 0 || s_len == 0){
            return 0;
        }

        int result = 0;

        if (first.charAt(f_len-1) == second.charAt(s_len-1)){
            result = 1 + lcs(first, second, f_len-1, s_len-1);
        } else {
            int left = lcs(first, second, f_len-1, s_len);
            int right = lcs(first, second, f_len, s_len-1);
            result = Math.max(left, right);
        }

        return result;
    }


    private static int lcs(String first, String second, int f_len, int s_len, Integer[][] mem) {

        if (f_len == 0 || s_len == 0){
            return 0;
        }

        if (mem[f_len][s_len] != null){
            return mem[f_len][s_len];
        }

        int result = 0;

        if (first.charAt(f_len-1) == second.charAt(s_len-1)){
            result = 1 + lcs(first, second, f_len-1, s_len-1, mem);
        } else {
            int left = lcs(first, second, f_len-1, s_len, mem);
            int right = lcs(first, second, f_len, s_len-1, mem);
            result = Math.max(left, right);
        }

        mem[f_len][s_len] = result;

        return result;
    }


}
