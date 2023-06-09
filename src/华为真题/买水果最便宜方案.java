package 华为真题;
/*//题目描述
//有m个水果超市在1-n个小时的不同时间段提供不同价格的打折水果，如果某餐厅每个小时都要新采购一种水果给餐厅使用的话， 请选出n个小时内，采购水果的最便宜的花费总和。
// （假设m个超市打折时间段可以覆盖n小时）
//输入描述
//N — 总小时数n
//m — 水果超市个数m
//X[0]x[1]x[2]—第2~m+1行：每行长度为3的数组，代表各超市在x[0]~x[1]小时（包含[x1]）提供价格为x2的水果。
//范围提示: 1 <= n < 2^10 （1024）
//
        4
        6
        2 3 10
        2 4 20
        1 3 15
        1 4 25
        3 4 8
        1 4 16
//输出描述    41
//采购水果的最便宜的花费总和。*/

import java.util.Arrays;
import java.util.Scanner;

public class 买水果最便宜方案 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] nums = new int[m][3];
        for (int i = 0; i < m; i++) {
            nums[i][0] = sc.nextInt();
            nums[i][1] = sc.nextInt();
            nums[i][2] = sc.nextInt();
        }

        Arrays.sort(nums, (a, b) -> a[2] - b[2]);    // sort其实默认就是a-b 就是从小到大排，但这里是二维数组，需要定位排哪列。

        int res = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums[j][0] <= i && nums[j][1] >= i) {
                    res += nums[j][2];
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
