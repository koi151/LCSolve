package com.javalearn;

import java.io.PrintWriter;

public class ValidAnagram_242_ES {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] chars = new int[256];
        for (char c: s.toCharArray()) {
            chars[c]++;
        }

        for (char c: t.toCharArray()) {
            chars[c]--;
            if (chars[c] < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);

        ValidAnagram_242_ES test = new ValidAnagram_242_ES();
        String s = "anagram", t = "nagaram";
        out.print(test.isAnagram(s, t));

        out.flush();
        out.close();
    }
}
