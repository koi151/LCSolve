package com.javalearn;

import java.io.PrintWriter;

public class LongestPalindrome_409 {
    public int longestPalindrome(String s) {
        if (s.isEmpty())
            return 0;

        int[] marks = new int[56];
        int cnt = 0, extra = 0;
        for (char c: s.toCharArray()) {
            marks[c-'a']++;
            if (marks[c-'a'] % 2 == 0)
                cnt+=2;
        }

        for (char c: s.toCharArray()) {
            if (marks[c-'a'] % 2 == 1)
                return cnt+1;
        }
        return cnt;
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);

        String s = "abccccdd";
        LongestPalindrome_409 test = new LongestPalindrome_409();
        out.print(test.longestPalindrome(s));

        out.flush();
        out.close();
    }
//    Input: s = "abccccdd"
//    Output: 7
//    Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
}
