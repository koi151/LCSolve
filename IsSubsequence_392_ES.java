package com.javalearn;

public class IsSubsequence_392_ES {
    // public static boolean isSubsequence(String s, String t) {
    //     if (s.isEmpty()) return true;

    //     int i = 0, j = 0;
    //     char[] strGiven = s.toCharArray();
    //     char[] subCheck = t.toCharArray();
    //     while (j < t.length()) {
    //         if (i < strGiven.length && strGiven[i] == subCheck[j]) {
    //             i++;
    //             j++;
    //         } else j++;
    //     }
    //     return i == s.length();
    // }

    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;

        int l = 0, r = 0;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        while (l < sArr.length && r < tArr.length) {
            if (sArr[l] == tArr[r]) {
                l++;
            }
            r++;
        }
        return l == sArr.length;
    }

    public static void main(String[] args) {
        String s = "axc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
