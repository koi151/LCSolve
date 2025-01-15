package com.javalearn;

import java.util.Arrays;

public class CountPrimes_204 {
    public static int countPrimes(int n) {
        if (n < 2) return 0;

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 3; i * i < n; i += 2) {
            if (isPrime[i]) {
                // Mark the odd multiples
                for (int j = i * i; j < n; j += 2 * i) {
                    isPrime[j] = false;
                }
            }
        }

        // Cnt integers (2 & odds)
        int count = n > 2 ? 1 : 0;
        for (int i = 3; i < n; i += 2) {
            if (isPrime[i]) count++;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(countPrimes(2));
    }
}
