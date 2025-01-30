package com.javalearn;

import java.util.Arrays;
import java.util.Set;
import java.util.Stack;

public class ReverseVowels_345_ES {
//    public static String reverseVowels(String s) {
//        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
//        Stack<Character> stack = new Stack<>();
//        for (Character c: s.toCharArray()) {
//            if (vowels.contains(Character.toLowerCase(c)))
//                stack.push(c);
//        }
//
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (vowels.contains(chars[i])) {
//                chars[i] = stack.pop();
//            }
//        }
//        return new String(chars);
//    }

    public static String reverseVowels(String s) {
        boolean[] isVowel = new boolean[128];
        char[] charArray = "aeiouAEIOU".toCharArray();
        for(char c: charArray){
            isVowel[c] = true;
        }

        char[] chars = s.toCharArray();
        int l = 0, r = s.length()-1;

        while (l < r) {
            while (l < r && !isVowel[chars[l]]) l++;
            while (l < r && !isVowel[chars[r]]) r--;
            char tmp = chars[l];
            chars[l] = chars[r];
            chars[r] = tmp;
            l++;
            r--;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }
}
