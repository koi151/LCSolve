package com.javalearn;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber_202_ES {
    private static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            totalSum += d * d;
            n /= 10;
        }
        return totalSum;
    }

    public static boolean isHappy(int n) {
        if (n < 0) return false;

        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        int n = 2;
        out.print(isHappy(n));
        out.flush();
        out.close();
    }
}
