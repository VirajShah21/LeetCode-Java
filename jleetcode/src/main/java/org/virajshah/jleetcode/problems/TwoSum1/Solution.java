package org.virajshah.jleetcode.problems.TwoSum1;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int find = target - nums[i];
            for (int j = i + 1; j < nums.length; j++)
                if (nums[j] == find)
                    return new int[] { i, j };
        }
        return null;
    }
}
