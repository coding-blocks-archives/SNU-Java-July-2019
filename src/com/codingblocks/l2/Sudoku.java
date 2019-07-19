package com.codingblocks.l2;

import java.util.Arrays;

public class Sudoku {
    public static void main(String[] args) {

        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        sudoku(board, 0, 0);
    }

    public static void sudoku(int[][] board, int row, int col){
        if (row == board.length){
            for (int i = 0; i < board.length; i++) {
                System.out.println(Arrays.toString(board[i]));
            }
            return;
        }

        if (col == board.length){
            sudoku(board, row + 1, 0);
            return;
        }

        if (board[row][col] == 0){

            for (int i = 1; i <= 9; i++) {
                if ( isSafe(board, row, col, i)){
                    board[row][col] = i;
                    sudoku(board, row, col + 1);
                    board[row][col] = 0;
                }
            }

        } else {
            sudoku(board, row, col + 1);
        }
    }

    private static boolean isSafe(int[][] board, int row, int col, int item) {

        for (int r = 0; r < board.length; r++) {
            if (board[r][col] == item){
                return false;
            }
        }

        for (int c = 0; c < board.length; c++) {
            if (board[row][c] == item){
                return false;
            }
        }

        int r_block = row/3;
        int c_block = col/3;

        for (int r = r_block*3; r < r_block*3 + 3; r++) {
            for (int c = c_block*3; c < c_block*3 + 3; c++) {
                if (board[r][c] == item){
                    return false;
                }
            }
        }

        return true;
    }
}
