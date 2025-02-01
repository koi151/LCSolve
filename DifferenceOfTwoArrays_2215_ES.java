package com.javalearn;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DifferenceOfTwoArrays_2215_ES {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.stream(nums1).boxed().toList());
        HashSet<Integer> set2 = new HashSet<>(Arrays.stream(nums2).boxed().toList());

        HashSet<Integer> diff1 = new HashSet<>(set1);
        HashSet<Integer> diff2 = new HashSet<>(set2);

        diff1.removeAll(set2);
        diff2.removeAll(set1);
        return Arrays.asList(new ArrayList<>(diff1), new ArrayList<>(diff2));
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        int[] nums1 = {1,2,3}, nums2 = {2,4,6};
        out.println(findDifference(nums1, nums2));

        out.flush();
        out.close();
    }
}
