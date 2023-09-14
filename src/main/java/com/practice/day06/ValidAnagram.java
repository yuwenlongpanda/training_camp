package com.practice.day06;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    // 使用hashmap，key表示字母，value表示次数
    // 首先遍历字符串 s存储字母元素并计数
    // 然后遍历字符串 t如果不存在相应字母则返回false，反之给字母相应的计数减1，如果计数为0则删除元素
    // 最后如果map为空则互为字母异位词
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            Integer count = map.getOrDefault(ch, 0);
            map.put(ch, ++count);
        }

        for (int j = 0; j < t.length(); j++) {
            char ch = t.charAt(j);
            if (map.containsKey(ch)) {
                Integer count = map.get(ch);
                map.put(ch, --count);
                if (count == 0) {
                    map.remove(ch);
                }
            } else {
                return false;
            }
        }
        return map.size() == 0;
    }

    // 使用int数组，数组下标0-25代表a-z，数组的值代表次数
    public boolean isAnagram2(String s, String t) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] += 1;
        }

        for (int j = 0; j < t.length(); j++) {
            arr[t.charAt(j) - 'a'] -= 1;
        }

        for(int item : arr) {
            if(item != 0) {
                return false;
            }
        }
        return true;
    }
}
