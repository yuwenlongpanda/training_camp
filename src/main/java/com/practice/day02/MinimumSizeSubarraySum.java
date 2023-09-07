package com.practice.day02;

public class MinimumSizeSubarraySum {

    // 双指针/滑动窗口
    // left, right分表代码连续子数组的头尾下标；sum表示该连续子数组的总和；res表示连续子数组的最小长度
    // right一直右移，直至sum大于等于target，计算出res；在满足条件的情况下，left也一直右移，不断更新res
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                res = Math.min(res, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return res != Integer.MAX_VALUE ? res : 0;
    }
}
