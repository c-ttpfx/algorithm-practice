package com.ttpfx;

import java.util.*;

/**
 * @author ttpfx
 * @since 2025/12/26
 */
public class _15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                if (nums[l] + nums[r] < -nums[i]) {
                    l++;
                } else if (nums[l] + nums[r] > -nums[i]) {
                    r--;
                } else {
                    result.add(List.of(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        _15 v = new _15();
        int[] nums = {2, -3, 0, -2, -5, -5, -4, 1, 2, -2, 2, 0, 2, -4, 5, 5, -10};
        System.out.println(v.threeSum(nums));
    }
}
