package org.virajshah.jleetcode.problems.anagrams438;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            if (isAnagram(s.substring(i, i + p.length()), p)) {
                indices.add(i);
            }
        }

        return indices;
    }

    private boolean isAnagram(String s1, String s2) {
        if (s1.equals(s2))
            return true;
        int[] ccount = new int[26];
        for (char c : s1.toCharArray())
            ccount[c - 'a']++;
        for (char c : s2.toCharArray())
            ccount[c - 'a']--;
        for (int n : ccount)
            if (n != 0)
                return false;
        return true;
    }
}
