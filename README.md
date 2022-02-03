# LeetCode-Java

I usually solve math problems in Python, but I thought to myself, "how can I make my life harder?"... and I found the solution: Solve LeetCode problems using Java

## Problem 438: Anagrams

**First Solution**
First I wrote a program which finds all permutations of `p`, then searches for all occurences of each of the anagrams in the base string `s`. This solution was not efficient because it too long to generate all permutations of very long strings.

**Second Solution**
I modified the previous solution to skip finding all possible anagrams. Let's say the length of `p` is `n`. Then we check each substring of `s` of length `n` (`0` to `n`, `1` to `n+1`, etc). For each substring, we check if `s.substring(i, i + n)` is an anagram of `p`; that is, do they share the same character counts. This solution is not efficient because for extremely large input sizes for either `s` or `p`, counting characters and substringing takes significant time.

**Third Solution**
Replaced the `isAnagram(String, String)` method with a simpler implementation. Since all characters are lowercase letters, there are `26` possible characters. Each index maps to a character from `a` to `z`. Then by iterating through `s1`, we increment each index when the corresponding character is encountered. Then by iterating through `s2`, we decrement each index when the corresponding character is encountered. If the two strings are anagrams, then all values should be exactly `0`.

```java
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
```

> Runtime: 1514 ms, faster than 5.52% of Java online submissions for Find All Anagrams in a String.
>
> Memory Usage: 43.5 MB, less than 54.76% of Java online submissions for Find All Anagrams in a String.
