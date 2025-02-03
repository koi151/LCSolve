package com.javalearn;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Objects;

public class WordPattern_290_ES {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length)
            return false;

        HashMap<Character, Integer> mapP = new HashMap<>();
        HashMap<String, Integer> mapS = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char charP = pattern.charAt(i);
            String wordS = words[i];
            if (!Objects.equals(mapP.put(charP, i), mapS.put(wordS, i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);

        System.out.println(wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(wordPattern("abba", "dog cat cat fish")); // false

        out.flush();
        out.close();
    }
}
