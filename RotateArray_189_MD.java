package com.javalearn;

import java.io.PrintWriter;
import java.util.Arrays;

public class RotateArray_189_MD {
//    public void rotate(int[] nums, int k) {
//        int maxL = nums.length;
//
//        int i = 0, j = k;
//        int tmp;
//        while (i < maxL && j != 0 ) {
//            tmp = nums[maxL-j];
//            nums[maxL-j] = nums[i];
//            nums[i] = tmp;
//            j--;
//            i++;
//        }
//    }

    public void rotate(int[] nums, int k) {
        int maxL = nums.length;
        k = k % maxL;

        StringBuilder head = new StringBuilder();
        for (int i = maxL - k; i < maxL; i++) {
            head.append(nums[i]).append(",");
        }

        StringBuilder tail = new StringBuilder();
        for (int i = 0; i < maxL - k; i++) {
            tail.append(nums[i]).append(",");
        }

        String[] res = (head + tail.toString()).split(",");
        for (int i = 0; i < maxL; i++)
            nums[i] = Integer.parseInt(res[i]);
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);

        int[] nums = {-1,-100,3,99};
        int k = 3;

        RotateArray_189_MD test = new RotateArray_189_MD();
        test.rotate(nums, k);
        out.print(Arrays.toString(nums));

        out.flush();
        out.close();
    }


//    Input: nums = [1,2,3,4,5,6,7], k = 3
//    Output: [5,6,7,1,2,3,4]
//    Explanation:
//    rotate 1 steps to the right: [7,1,2,3,4,5,6]
//    rotate 2 steps to the right: [6,7,1,2,3,4,5]
//    rotate 3 steps to the right: [5,6,7,1,2,3,4]

}
