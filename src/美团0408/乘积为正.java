package 美团0408;

import java.util.Scanner;

/*3.21美团笔试题
        乘积为正
        时间限制： 1000MS
        内存限制： 65536KB
        题目描述：小美现在有一个序列，序列中仅包含1和 - 1两种数字。小美现在想要知道，有多少个连续的子序列，序列中的数字乘积为正。

        输入描述
        第一行一个正整数n，表示小美手中的序列长度。
        第二行n个空格隔开的数字，每个数字只能是1和 - 1中的一种。
        对于80 % 的数据保证1 <= n <= 500
        对于剩余20 % 的数据保证1 <= n <= 5000
        输出描述
        一行一个正整数表示有多少连续的子序列满足题目要求。*
样例输入
4
1 1 -1 -1
样例输出
6
提示 {1} {1} {1,1} {-1,-1} {1,-1,-1} {1,1,-1,-1}
共有6个连续子序列满足要求。
样例输入
5
1 1 -1 -1 1
样例输出
10
 */
public class 乘积为正 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] pres = new int[n+1];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == -1) pres[i + 1] = pres[i] + 1;
            else pres[i + 1] = pres[i];
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                    if ((pres[j+1]-pres[i]) %2 == 0) count++;
            }
        }
        System.out.println(count);
    }
}
