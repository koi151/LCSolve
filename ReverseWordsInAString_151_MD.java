package com.javalearn;

public class ReverseWordsInAString_151_MD {

    // "\\s" matches any whitespace character
    // "+" match one or more occurrences
//    public static String reverseWords(String s) {
//        List<String> words = new ArrayList<>(List.of(s.trim().split("\\s+")));
//        Collections.reverse(words);
//        return String.join(" ",words);
//    }

    public static String reverseWords(String s) { // better runtime, worse memory
        String[] res = s.trim().split(" ");
        StringBuilder str = new StringBuilder();

        for (int i = res.length - 1; i >= 0; i--) {
            if (res[i].isEmpty()) {
                continue;
            }
            str.append(res[i]);
            if (i > 0)
                str.append(" ");
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.print(reverseWords(s));
    }
}
