package com.practice.day44;

public class Rucksack {

    public static void main(String[] args) {
        Item item1 = new Item(1, 15);
        Item item2 = new Item(3, 20);
        Item item3 = new Item(4, 30);
        Item[] items = {item1, item2, item3};
        int m = 4;
        rucksack(items, m);
    }

    // dp[i][j] 代表从 [0,i] 的物品任取，放入重量为 j 的背包的最大价值为 dp[i][j]
    // 不取物品  dp[i][j] = dp[i-1][j]
    // 取物品   dp[i][j] = Math.max(dp[i-1][j], items[i].value + dp[i-1][j-items[i].weight])
    // 如果j < j-items[i].weight] 则不取物品，反之可以取物品
    // 初始化 dp[i][0] = 0; 如果 j >= items[0].weight; dp[0][j] = items[0].value
    public static void rucksack(Item[] items, int m) {
        int n = items.length;
        int[][] dp = new int[n][m + 1];

        for (int j = m; j >= 0; j--) {
            if (j < items[0].weight) {
                break;
            }
            dp[0][j] = items[0].value;
        }

        // 先遍历物品，然后遍历背包
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= m; j++) {
                if (j < items[i].weight) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], items[i].value + dp[i - 1][j - items[i].weight]);
                }
            }
        }

        // 打印
        print(dp, n, m);
    }

    public static void print(int[][] dp, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println("\n");
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
