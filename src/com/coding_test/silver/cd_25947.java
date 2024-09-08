package com.coding_test.silver;

import java.util.Arrays;
import java.util.Scanner;

public class cd_25947 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 선물의 개수
        int a = sc.nextInt(); // 할인을 받을 수 있는 최대 개수
        int b = sc.nextInt(); // 주어진 예산

        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // 선물 가격 오름차순 정렬
        Arrays.sort(prices);

        int count = 0;
        int totalCost = 0;

        // 최대 a개의 선물에 대해 할인을 적용
        for (int i = 0; i < n; i++) {
            int cost;
            if (i < a) {
                cost = prices[i] / 2; // 할인을 받을 수 있는 경우
            } else {
                cost = prices[i]; // 원래 가격으로 계산
            }
            if (totalCost + cost <= b) {
                totalCost += cost;
                count++;
            } else {
                break;
            }
        }

        // 결과 출력
        System.out.println(count);
    }
}
