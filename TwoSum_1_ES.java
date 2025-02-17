package com.javalearn;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_1_ES {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (map.containsKey(t)) {
                return new int[] {map.get(t), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);

        int[] nums = {3,2,4};
        int target = 6;
        out.print(Arrays.toString(twoSum(nums, target)));

        out.flush();
        out.close();
    }

}
