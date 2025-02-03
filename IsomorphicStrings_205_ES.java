package com.javalearn;

import java.io.PrintWriter;

public class IsomorphicStrings_205_ES {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (mapS[charS] != mapT[charT])
                return false;
            mapS[charS] = i + 1; // avoid 0
            mapT[charT] = i + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        String s = "paper", t = "title";
        out.print(isIsomorphic(s, t));

        out.flush();
        out.close();
    }
}
