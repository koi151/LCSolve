package com.javalearn;


public class BestTimeToBuyAndSellStock_121_ES {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2)
            return 0;

        int minVal = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price: prices) {
            if (minVal > price) {
                minVal = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minVal);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] nums = {7,6,4,3,1};
        System.out.println(maxProfit(nums));
    }
}
