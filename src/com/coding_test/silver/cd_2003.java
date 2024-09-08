package com.coding_test.silver;

import java.util.Scanner;

public class cd_2003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 수열의 길이
		int m = sc.nextInt();	// 목표 합 
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();  // 수열 입력 
		}
		
		int start = 0, end = 0;		// 투 포인터 초기화 
		int currentSum = 0;		// 현재 부분합 
		int count = 0;		// 경우의 수 카운트 
		
		while (end <= n) {
			if (currentSum >= m) {
				currentSum -= arr[start++];	// 부분합이 목표값을 초과하면 start 포인터를 오른쪽으로 이동   
			} else if (end == n) {
				break;		// end 포인터가 끝에 도달하면 종료 
			} else {
				currentSum += arr[end++];	// 부분합이 목표값보다 작으면 end 포인터를 오른쪽으로 이동 
			}
			
			if (currentSum == m) {
				count++;	// 목표값과 일치하면 경우의 수 증가 
			}
		}
		
		System.out.println(count);	// 결과 출력
	}

}
