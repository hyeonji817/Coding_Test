package com.coding_test.silver;

import java.util.Arrays;
import java.util.Scanner;

public class cd_25947 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // ������ ����
        int a = sc.nextInt(); // ������ ���� �� �ִ� �ִ� ����
        int b = sc.nextInt(); // �־��� ����

        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // ���� ���� �������� ����
        Arrays.sort(prices);

        int count = 0;
        int totalCost = 0;

        // �ִ� a���� ������ ���� ������ ����
        for (int i = 0; i < n; i++) {
            int cost;
            if (i < a) {
                cost = prices[i] / 2; // ������ ���� �� �ִ� ���
            } else {
                cost = prices[i]; // ���� �������� ���
            }
            if (totalCost + cost <= b) {
                totalCost += cost;
                count++;
            } else {
                break;
            }
        }

        // ��� ���
        System.out.println(count);
    }
}
