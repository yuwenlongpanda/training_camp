package com.practice.day44;

public class Rucksack2 {

    public static void main(String[] args) {
        Item item1 = new Item(1, 15);
        Item item2 = new Item(3, 20);
        Item item3 = new Item(4, 30);
        Item[] items = {item1, item2, item3};
        int m = 4;
        rucksack(items, m);
    }

    // 滚动数组就是把上一层数组拷贝下来了
    // dp[j] 放入重量为 j 的背包的最大价值为 dp[j]
    // 不放物品 dp[j] = dp[j]
    // 放物品  dp[j] = Math.max(dp[j], items[i].value + dp[j-items[i].weight])
    // 如果j < j-items[i].weight] 则不取物品，反之可以取物品
    // 初始化，如果 j >= items[0].weight; dp[j] = items[0].value
    public static void rucksack(Item[] items, int m) {
        int n = items.length;
        int[] dp = new int[m + 1];

        for (int j = m; j >= 0; j--) {
            if (j < items[0].weight) {
                break;
            }
            dp[j] = items[0].value;
        }

        // 先遍历物品，然后遍历背包，但背包是倒序遍历
        for (int i = 1; i < n; i++) {
            for (int j = m; j >= 1; j--) {
                if (j < items[i].weight) {
                    dp[j] = dp[j];
                } else {
                    dp[j] = Math.max(dp[j], items[i].value + dp[j - items[i].weight]);
                }
            }
        }

        // 打印
        print(dp, n, m);
    }

    public static void print(int[] dp, int n, int m) {
        for (int j = 0; j <= m; j++) {
            System.out.print(dp[j] + "\t");
        }
    }

    public static class Item {

        public int weight;

        public int value;

        public Item() {
        }

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }
}
