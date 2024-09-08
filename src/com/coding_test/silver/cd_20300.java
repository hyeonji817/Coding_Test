package com.coding_test.silver;

import java.util.Arrays;
import java.util.Scanner;

public class cd_20300 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();   // � �ⱸ�� ���� 
		long[] loss = new long[n];  // �� � �ⱸ�� ���� �ս� �� 
		
		for (int i = 0; i < n; i++) {
			loss[i] = sc.nextLong();
		}
		
		// ���� �ս� ���� ������������ ���� 
		Arrays.sort(loss);
		
		long maxLoss = 0; 
		
		if (n % 2 == 1) {
			// � �ⱸ�� ������ Ȧ���� ��� ���� ū ���� ȥ�� ��� 
			maxLoss = loss[n - 1];	// ���� ū ���� �ʱ� maxLoss�� ���� 
			n--;	// ���� ¦���� ó���ϱ� ���� n�� ���� 
		}
		
		// �� ���������� � �ⱸ�� ���� �ִ� ���� �ս� �ּ�ȭ 
		for (int i = 0; i < n / 2; i++) {
			long pairLoss = loss[i] + loss[n - 1 - i]; 
			maxLoss = Math.max(maxLoss, pairLoss);
		}
		
		// ��� ��� 
		System.out.println(maxLoss);
	}
}
