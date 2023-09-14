package com.practice.day07;

import java.util.HashMap;
import java.util.Map;

public class FourSumIi {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int item1 : nums1) {
            for (int item2 : nums2) {
                int key = item1 + item2;
                int count = map.getOrDefault(key, 0);
                map.put(key, ++count);
            }
        }

        int count = 0;
        for (int item3 : nums3) {
            for (int item4 : nums4) {
                int key = 0 - (item3 + item4);
                if (map.containsKey(key)) {
                    count += map.get(key);
                }
            }
        }
        return count;
    }
}
