package com.javalearn;

public class CanPlaceFlower_605_ES {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;
        int maxF = 0;
        for (int i = 0; i < l ; i++) {
            if (flowerbed[i] == 0) {
                boolean leftE = (i == 0) || (flowerbed[i-1] == 0);
                boolean rightE = (i == l-1) || (flowerbed[i+1] == 0);
                if (leftE && rightE) {
                    flowerbed[i] = 1;
                    maxF++;
                }
                if (maxF >= n)
                    return true;
            }
        }
        return maxF >= n;
    }

    public static void main(String[] args) {
        int[] flowerbed = {0,0};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}
