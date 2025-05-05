package com.javalearn;

import java.io.PrintWriter;

public class RotateString_796_ES {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        return (s+s).contains(goal);
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);

        String s = "abcde";
        String goal = "cdeab";
        out.print(rotateString(s, goal));

        out.flush();
        out.close();
    }
}
