package com.coding_test.silver;

import java.util.Arrays;
import java.util.Scanner;

public class cd_18310 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// �� ���� 
		int[] houses = new int[N]; 	 // �� ������ ���� ��ġ�� ���� �迭 ���� 
		
		for (int i = 0; i < N; i++) {  // �迭���� �־ �� ������ ���� ��, ��ġ�� ���ϴ� �迭 ���� 
			houses[i] = sc.nextInt();
		}
		
		// ������ �迭 ���� 
		Arrays.sort(houses);
		
		// �߰��� ���ϱ� (�׷��� �� �Ÿ� ������ �ּ�ȭ �� �� ����) 
		int medianIndex = (N - 1) / 2;
		int optimalIndex = houses[medianIndex];
		
		// ��� ��� 
		System.out.println(optimalIndex);
	}
}
