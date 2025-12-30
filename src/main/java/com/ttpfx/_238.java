package com.ttpfx;

import java.util.Arrays;

/**
 * @author ttpfx
 * @since 2025/12/30
 */
public class _238 {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            ans[i] = nums[i - 1] * ans[i - 1];
        }
        int r = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            r *= nums[i + 1];
            ans[i] = ans[i] * r;
        }
        ans[0] = r;
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,1,0,-3,3};
        System.out.println(Arrays.toString(new _238().productExceptSelf(nums)));
    }
}
