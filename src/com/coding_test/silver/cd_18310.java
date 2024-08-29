package com.coding_test.silver;

import java.util.Arrays;
import java.util.Scanner;

public class cd_18310 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 집 개수 
		int[] houses = new int[N]; 	 // 집 개수에 따른 위치를 위한 배열 생성 
		
		for (int i = 0; i < N; i++) {  // 배열값을 넣어서 집 개수를 정한 뒤, 위치값 정하는 배열 구현 
			houses[i] = sc.nextInt();
		}
		
		// 생성한 배열 정렬 
		Arrays.sort(houses);
		
		// 중간값 구하기 (그래야 집 거리 간격을 최소화 할 수 있음) 
		int medianIndex = (N - 1) / 2;
		int optimalIndex = houses[medianIndex];
		
		// 결과 출력 
		System.out.println(optimalIndex);
	}
}
