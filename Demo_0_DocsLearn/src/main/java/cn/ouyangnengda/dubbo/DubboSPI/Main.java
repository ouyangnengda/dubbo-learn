package cn.ouyangnengda.dubbo.DubboSPI;

import java.util.Scanner;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月12日 15:44:00
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = input.nextInt();
            }
        }*/
        int maxNum = input.nextInt();
        int max = 0;
        if (maxNum > 0) {
            max = maxNum;
        }
        for (int i = 0; i < (n * n - 1); i++) {
            int p = input.nextInt();
            if (p > maxNum) {
                maxNum = p;
            }
            if (p > 0) {
                max += p;
            }
        }
        if (max == 0) {
            System.out.println(maxNum);
        } else {
            System.out.println(Math.max(max, maxNum));
        }
    }
}
