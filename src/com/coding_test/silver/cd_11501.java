package com.coding_test.silver;

import java.util.Scanner;

public class cd_11501 {
	public static void main(String[] args) {
		try {
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();   // 테스트 케이스 수 
		    
		    while (T --> 0) {
		        int n = sc.nextInt();  // 날의 수 
		        int[] prices = new int[n];
		        
		        for (int i = 0; i < n; i++) {
		            prices[i] = sc.nextInt();    // 각 날의 주가 
		        }
		        
		        long maxProfit = 0;     // 최대 이익 
		        int maxPrice = 0;       // 오른쪽에서부터의 최대 주가 
		        
		        // 오른쪽에서부터 주가 탐색 
		        for (int i = n -1; i >= 0; i--) {
		            if (prices[i] > maxPrice) {
		                maxPrice = prices[i];    // 새로운 최대 주가 갱신 
		            } else {
		                maxProfit += (maxPrice - prices[i]);    // 이익 계산 
		            }
		        }
		        
		        // 결과 출력 
		        System.out.println(maxProfit);
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred: " + e.getMessage());
		    e.printStackTrace();
		}

	}
}
