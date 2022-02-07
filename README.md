# LeetCode-Java

![](LeetCode.png)

I usually solve math problems in Python, but I thought to myself, "how can I make my life harder?"... and I found the solution: Solve LeetCode problems using Java

## Table of Contents

1.  [Problem 1: Two Sum](#problem-1-two-sum)
2.  [Problem 2: Add Two Numbers](#problem-2-add-two-numbers)
3.  [Problem 23: Merge Sorted List](#problem-23-merge-sorted-list)
4.  [Problem 164: Maximum Gap](#problem-164-maximum-gap)
5.  [Problem 438: Anagrams](#problem-438-anagrams)
6.  [Problem 1847: Closest Room](#problem-1847-closest-room)
7.  [Problem 2070: Most Beautiful Item for Each Query](#problem-2070-most-beautiful-item-for-each-query)

## Problem 1: Two Sum

> [Two Sum on LeetCode](https://leetcode.com/problems/two-sum/)  
> [Solution (Code)](jleetcode/src/main/java/org/virajshah/jleetcode/problems/TwoSum1/Solution.java)  
> [Solution (Test)](jleetcode/src/test/java/org/virajshah/jleetcode/problems/TwoSum1/SolutionTest.java)
>
> Runtime: **56 ms**, faster than **29.63%** of Java online submissions for Two Sum.  
> Memory Usage: **45.3 MB**, less than **8.98%** of Java online submissions for Two Sum.

![](README/images/TwoSumSolution1.png)

## Problem 2: Add Two Numbers

> [Add Two Numbers on LeetCode](https://leetcode.com/problems/add-two-numbers/)  
> [Solution (Code)](jleetcode/src/main/java/org/virajshah/jleetcode/problems/AddTwoNumbers2/Solution.java)  
> [Solution (Test)](jleetcode/src/test/java/org/virajshah/jleetcode/problems/AddTwoNumbers2/SolutionTest.java)
>
> Runtime: **4 ms**, faster than **44.47%** of Java online submissions for Add Two Numbers.  
> Memory Usage: **47.6 MB**, less than **11.04%** of Java online submissions for Add Two Numbers.

![](README/images/AddTwoNumbersSolution1.png)

## Problem 23: Merge K Sorted List

> [Merge K Sorted List on LeetCode](https://leetcode.com/problems/merge-k-sorted-lists/)  
> [Solution (Code)](jleetcode/src/main/java/org/virajshah/jleetcode/problems/MergeSortedLists23/Solution.java)  
> [Solution (Test)](jleetcode/src/test/java/org/virajshah/jleetcode/problems/MergeSortedLists23/SolutionTest.java)
>
> Runtime: **374 ms**, faster than **5.02%** of Java online submissions for Merge k Sorted Lists.  
> Memory Usage: **48 MB**, less than **5.33%** of Java online submissions for Merge k Sorted Lists.

![](README/images/MergeKSortedListsSolution.png)

## Problem 164: Maximum Gap

> [Maximum Gap on LeetCode](https://leetcode.com/problems/maximum-gap/)  
> [Solution (Code)](jleetcode/src/main/java/org/virajshah/jleetcode/problems/MaximumGap164/Solution.java)  
> [Solution (Test)](jleetcode/src/test/java/org/virajshah/jleetcode/problems/MaximumGap164/SolutionTest.java)
>
> Runtime: **58 ms**, faster than **35.92%** of Java online submissions for Maximum Gap.  
> Memory Usage: **74.5 MB**, less than **55.62%** of Java online submissions for Maximum Gap.

![](README/images/MaximumGapSolution.png)

## Problem 438: Anagrams

🆇 **First Solution**
First I wrote a program which finds all permutations of `p`, then searches for all occurences of each of the anagrams in the base string `s`. This solution was not efficient because it too long to generate all permutations of very long strings.

🆇 **Second Solution**
I modified the previous solution to skip finding all possible anagrams. Let's say the length of `p` is `n`. Then we check each substring of `s` of length `n` (`0` to `n`, `1` to `n+1`, etc). For each substring, we check if `s.substring(i, i + n)` is an anagram of `p`; that is, do they share the same character counts. This solution is not efficient because for extremely large input sizes for either `s` or `p`, counting characters and substringing takes significant time.

✅ **Third Solution**
Replaced the `isAnagram(String, String)` method with a simpler implementation. Since all characters are lowercase letters, there are `26` possible characters. Each index maps to a character from `a` to `z`. Then by iterating through `s1`, we increment each index when the corresponding character is encountered. Then by iterating through `s2`, we decrement each index when the corresponding character is encountered. If the two strings are anagrams, then all values should be exactly `0`.

> Runtime: **1514 ms**, faster than **5.52%** of Java online submissions for Find All Anagrams in a String.
>
> Memory Usage: **43.5 MB**, less than **54.76%** of Java online submissions for Find All Anagrams in a String.

## Problem 1847: Closest Room

> https://leetcode.com/problems/closest-room/

**Solution 1**

Could not find an efficient solution

## Problem 2070: Most Beautiful Item for Each Query

> [🔗 Most Beautiful Item for Each Query on LeetCode](https://leetcode.com/problems/most-beautiful-item-for-each-query/)

🆇 **Solution 1**

This is a straightforward solution, however, it is not efficient enough. When dealing with large integers and a large input size, the LeetCode time limit is exceeded.

✅ **Solution 2**

I realized that this method would just always take way too long because it has O(n\*i) time. This is bad for a problem which scales so largely. So then I decided to use a hashmap to build a map which increasingly assigns maximum beauty, similar to a napsack problem. Then we add all the queries which do not have a key in the `pToB` map. Then we fill them in by iterating over the sorted keyset and giving all unfilled queries in the map the same value as the previous key.

> Runtime: **102 ms**, faster than **40.96%** of Java online submissions for Most Beautiful Item for Each Query.
>
> Memory Usage: **141.2 MB**, less than **12.92%** of Java online submissions for Most Beautiful Item for Each Query.
