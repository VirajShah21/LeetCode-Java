package org.virajshah.jleetcode.problems.MedianOfTwoSortedArrays4;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] nums = new int[n];

        for (int i = 0; i < nums1.length; i++)
            nums[i] = nums1[i];
        for (int i = 0; i < nums2.length; i++)
            nums[i + nums1.length] = nums2[i];

        Arrays.sort(nums);

        if (n % 2 == 0)
            return (nums[n / 2 - 1] + nums[n / 2]) / 2.0;
        else
            return nums[n / 2];
    }
}