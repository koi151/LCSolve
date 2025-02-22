package com.javalearn;

import java.io.PrintWriter;

public class FirstUniqueChar_387_ES {
    public int firstUniqChar(String s) {
        int[] cnt = new int[26];
        char[] chars = s.toCharArray();

        for (char c : chars)
            cnt[c-'a']++;

        for (int i = 0; i < chars.length; i++) {
            if (cnt[chars[i] - 'a'] == 1)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);

        String s = "leetcode";
        FirstUniqueChar_387_ES test = new FirstUniqueChar_387_ES();
        out.print(test.firstUniqChar(s));

        out.flush();
        out.close();
    }
}
