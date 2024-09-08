package com.coding_test.silver;

import java.util.Scanner;

public class cd_2003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// ������ ����
		int m = sc.nextInt();	// ��ǥ �� 
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();  // ���� �Է� 
		}
		
		int start = 0, end = 0;		// �� ������ �ʱ�ȭ 
		int currentSum = 0;		// ���� �κ��� 
		int count = 0;		// ����� �� ī��Ʈ 
		
		while (end <= n) {
			if (currentSum >= m) {
				currentSum -= arr[start++];	// �κ����� ��ǥ���� �ʰ��ϸ� start �����͸� ���������� �̵�   
			} else if (end == n) {
				break;		// end �����Ͱ� ���� �����ϸ� ���� 
			} else {
				currentSum += arr[end++];	// �κ����� ��ǥ������ ������ end �����͸� ���������� �̵� 
			}
			
			if (currentSum == m) {
				count++;	// ��ǥ���� ��ġ�ϸ� ����� �� ���� 
			}
		}
		
		System.out.println(count);	// ��� ���
	}

}
