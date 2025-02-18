package com.javalearn;

import java.io.PrintWriter;
import java.util.*;

public class GroupAnagrams_49_MD {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s: strs) {
            int[] cnt = new int[26];
            char[] chars = s.toCharArray();

            for (char c : chars) {
                cnt[c - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for (int i: cnt) {
                keyBuilder.append(i).append(",");
            }

            String key = keyBuilder.toString();
//            if (!map.containsKey(key))
//                map.put(key, new ArrayList<>());
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);

        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams_49_MD test = new GroupAnagrams_49_MD();
        out.print(test.groupAnagrams(strs).toString());

        out.flush();
        out.close();
    }
}
