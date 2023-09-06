package com.practice.day01;

class BinarySearch {

    // 双指针，left、right 分别指向头尾节点并逐步向中间移动，直到找到目标值或退出循环为止
    public static int search(int[] nums, int target) {
        int left =0, right = nums.length-1;

        while(left <= right) {
            int mid = (right - left) / 2 + left;
            if(target > nums[mid]) {
                left = mid + 1;
            } else if(target < nums[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}