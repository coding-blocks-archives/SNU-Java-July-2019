package com.codingblocks.l2;

import java.util.Arrays;

public class Knight {
//    public static void main(String[] args) {
//
//        boolean[][] board = new boolean[8][8];
//
//        sudoku(board, 0, 0);
//    }
//
//    public static int knight(boolean[][] board, int row, int col){
//
//        if (row == board.length){
//            return 1;
//        }
//
//        if (col == board.length) {
//            return knight(board, row + 1, 0);
//        }
//
//        if(isSafe(board, row, col)){
//            board[row][col] = true;
//            knight(board, row, col + 1, count - 1);
//            board[row][col] = false;
//        }
//
//        knight(board, row, col + 1, count);
//    }
//
//    private static boolean isSafe(int[][] board, int row, int col, int item) {
//
//        for (int r = 0; r < board.length; r++) {
//            if (board[r][col] == item){
//                return false;
//            }
//        }
//
//        for (int c = 0; c < board.length; c++) {
//            if (board[row][c] == item){
//                return false;
//            }
//        }
//
//        int r_block = row/3;
//        int c_block = col/3;
//
//        for (int r = r_block*3; r < r_block*3 + 3; r++) {
//            for (int c = c_block*3; c < c_block*3 + 3; c++) {
//                if (board[r][c] == item){
//                    return false;
//                }
//            }
//        }
//
//        return true;
//    }
}
