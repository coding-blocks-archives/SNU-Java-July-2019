package com.codingblocks.l2;

public class EggDrop {
    public static void main(String[] args) {

        int eggs = 10;
        int floors = 5000;

        Integer[][] mem = new Integer[eggs+1][floors+1];

        System.out.println(eggDrop(eggs, floors, mem));
    }

    private static int eggDrop(int eggs, int floors) {
        if (floors == 0) {
            return 0;
        }

        if (eggs == 1){
            return floors;
        }

        int best = floors;

        for (int f = 1; f <= floors; f++) {
            int up = eggDrop(eggs, floors - f);
            int down = eggDrop(eggs - 1, f-1);

            int worst= 1 + Math.max(up, down);

            if (worst < best){
                best = worst;
            }
        }

        return best;
    }

    private static int eggDrop(int eggs, int floors, Integer[][] mem) {
        if (floors == 0) {
            return 0;
        }

        if (eggs == 1){
            return floors;
        }

        if (mem[eggs][floors] != null){
            return mem[eggs][floors];
        }


        int best = floors;

        for (int f = 1; f <= floors; f++) {
            int up = eggDrop(eggs, floors - f, mem);
            int down = eggDrop(eggs - 1, f-1, mem);

            int worst= 1 + Math.max(up, down);

            if (worst < best){
                best = worst;
            }
        }

        mem[eggs][floors] = best;

        return best;
    }
}
