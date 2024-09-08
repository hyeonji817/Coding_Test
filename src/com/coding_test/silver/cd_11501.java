package com.coding_test.silver;

import java.util.Scanner;

public class cd_11501 {
	public static void main(String[] args) {
		try {
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();   // �׽�Ʈ ���̽� �� 
		    
		    while (T --> 0) {
		        int n = sc.nextInt();  // ���� �� 
		        int[] prices = new int[n];
		        
		        for (int i = 0; i < n; i++) {
		            prices[i] = sc.nextInt();    // �� ���� �ְ� 
		        }
		        
		        long maxProfit = 0;     // �ִ� ���� 
		        int maxPrice = 0;       // �����ʿ��������� �ִ� �ְ� 
		        
		        // �����ʿ������� �ְ� Ž�� 
		        for (int i = n -1; i >= 0; i--) {
		            if (prices[i] > maxPrice) {
		                maxPrice = prices[i];    // ���ο� �ִ� �ְ� ���� 
		            } else {
		                maxProfit += (maxPrice - prices[i]);    // ���� ��� 
		            }
		        }
		        
		        // ��� ��� 
		        System.out.println(maxProfit);
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred: " + e.getMessage());
		    e.printStackTrace();
		}

	}
}
