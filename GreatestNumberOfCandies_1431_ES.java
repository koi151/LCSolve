package com.javalearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestNumberOfCandies_1431_ES {
//    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        int maxVal = Integer.MIN_VALUE;
//        List<Boolean> res = new ArrayList<>(candies.length);
//        for (int c: candies) {
//            if (c > maxVal)
//                maxVal = c;
//        }
//        for (int c: candies) {
//            res.add(c + extraCandies >= maxVal);
//        }
//        return res;
//    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxVal = Arrays.stream(candies).max().orElse(0);
        return Arrays.stream(candies)
            .mapToObj(c -> c + extraCandies >= maxVal)
            .toList();
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        kidsWithCandies(candies, extraCandies)
            .forEach(System.out::println);
    }
}
