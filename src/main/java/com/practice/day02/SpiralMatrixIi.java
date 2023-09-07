package com.practice.day02;

public class SpiralMatrixIi {

    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];

        // 循环次数
        int loop = n / 2;
        // 起始位置
        int startx = 0, starty = 0;
        // 结束位置
        int endx = n - 1, endy = n - 1;
        // 二维数组元素值
        int count = 1;

        while (loop > 0) {
            // i=startx;j=[starty, endy)
            for (int j = starty; j < endy; j++) {
                res[startx][j] = count;
                count++;
            }

            // i=[startx, endx);j=endy
            for (int i = startx; i < endx; i++) {
                res[i][endy] = count;
                count++;
            }

            // i=endx;j=[endy, starty)
            for (int j = endy; j > starty; j--) {
                res[endx][j] = count;
                count++;
            }

            // i=[endx, startx);j=starty
            for (int i = endx; i > startx; i--) {
                res[i][starty] = count;
                count++;
            }

            startx++;
            starty++;
            endx--;
            endy--;
            loop--;
        }

        // 处理n=奇数的情况
        if (n % 2 == 1) {
            res[startx][starty] = count;
        }
        return res;
    }
}
