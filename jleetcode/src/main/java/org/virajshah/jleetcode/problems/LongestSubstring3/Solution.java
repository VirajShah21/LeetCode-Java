package org.virajshah.jleetcode.problems.LongestSubstring3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        short start = 0;
        Map<Character, Short> chars = new HashMap<>();
        char c = 0;
        Short lastIndex = null;
        short max = 0;
        short i = 0;
        for (i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            lastIndex = chars.get(c);
            if (lastIndex == null || lastIndex == -1) {
                chars.put(c, i);
            } else {
                if (i - start > max)
                    max = (short) (i - start);
                start = (short) Math.max(lastIndex + 1, start);
                chars.put(c, i);
            }
        }

        return Math.max(max, i - start);
    }
}