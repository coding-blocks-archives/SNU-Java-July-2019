package com.codingblocks.l2;

import java.util.Arrays;
import java.util.Comparator;

public class Greedy {

    public static void main(String[] args) {
        int[] weights = {10, 5, 7, 9, 11};
        int[] price = {20, 10, 17, 19, 18};

        int cap = 40;

        Item[] items = new Item[weights.length];

        for (int i = 0; i < items.length; i++) {
            items[i] = new Item(weights[i], price[i]);
        }

        Arrays.sort(items, (o1, o2) -> o1.density < o2.density ? 1 : -1);

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].density);
        }

        float max = 0;

        for (int i = 0; i < items.length; i++) {
            if (items[i].weight <= cap){
                max += items[i].price;
                cap -= items[i].weight;
            } else {
                max += items[i].density * cap;
                break;
            }
        }

        System.out.println(max);

    }

    public static class Item {
        int weight;
        int price;
        float density;

        public Item(int weight, int price) {
            this.weight = weight;
            this.price = price;

            this.density = ((float)price) / weight;
        }
    }
}
