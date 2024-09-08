package com.coding_test.silver;

import java.util.Arrays;
import java.util.Scanner;

public class cd_20300 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();   // 운동 기구의 개수 
		long[] loss = new long[n];  // 각 운동 기구의 근육 손실 값 
		
		for (int i = 0; i < n; i++) {
			loss[i] = sc.nextLong();
		}
		
		// 근육 손실 값을 오름차순으로 정렬 
		Arrays.sort(loss);
		
		long maxLoss = 0; 
		
		if (n % 2 == 1) {
			// 운동 기구의 개수가 홀수인 경우 가장 큰 값을 혼자 사용 
			maxLoss = loss[n - 1];	// 가장 큰 값을 초기 maxLoss로 설정 
			n--;	// 남은 짝수를 처리하기 위해 n을 감소 
		}
		
		// 양 끝에서부터 운동 기구를 묶어 최대 근육 손실 최소화 
		for (int i = 0; i < n / 2; i++) {
			long pairLoss = loss[i] + loss[n - 1 - i]; 
			maxLoss = Math.max(maxLoss, pairLoss);
		}
		
		// 결과 출력 
		System.out.println(maxLoss);
	}
}
