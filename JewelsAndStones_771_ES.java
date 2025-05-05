package com.javalearn;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones_771_ES {
    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (char c: jewels.toCharArray()) {
            set.add(c);
        }

        int cnt = 0;
        for (char c: stones.toCharArray()) {
            if (set.contains(c))
                ++cnt;
        }
        return cnt;
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        String jewels = "aA";
        String stones = "aAAbbbb";

        out.print(numJewelsInStones(jewels, stones));

        out.flush();
        out.close();
    }
}
