package com.jonledet.searchinsert;

/*
 * 35. Search Insert Position
 * 
 * Runtime:
 * 0 ms
 * Beats 100.00%
 * 
 * Memory:
 * 42.56 MB
 * Beats 93.57%
 */

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return r + 1;
    }
}
