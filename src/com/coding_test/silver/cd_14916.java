package com.coding_test.silver;

import java.util.Scanner;

public class cd_14916 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();   // 거슬러 줄 금액 
		
		int result = -1;	// 최소 동전의 개수 초기값을 -1로 설정 
		
		// 케이스별로 처리 
		if (n == 1 || n == 3) {
			// 1원 또는 3원은 2원과 5원으로 나눌 수 없음 
			result = -1;
		} else if (n % 5 == 0) {
			// 5로 나누어 떨어지면 5원짜리 동전만 사용 
			result = n / 5; 
		} else if (n % 5 == 1 || n % 5 == 3) {
			// 5로 나눈 나머지가 1 또는 3이면 
			result = (n / 5) - 1 + ((n%5) + 5) / 2; 
		} else if (n % 5 == 2 || n % 5 == 4) {
			// 5로 나눈 나머지가 2 또는 4면 
			result = (n / 5) + (n % 5) / 2;
		}
		
		System.out.println(result);
	}
}
