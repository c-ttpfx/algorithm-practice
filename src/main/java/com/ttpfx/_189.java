package com.ttpfx;

import java.util.Arrays;

/**
 * @author ttpfx
 * @since 2025/12/29
 */
public class _189 {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int t = nums[start];
            nums[start] = nums[end];
            nums[end] = t;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        _189 v = new _189();
        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(nums));
        v.rotate(nums, 1);
        System.out.println(Arrays.toString(nums));
    }
}
