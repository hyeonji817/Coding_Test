package com.coding_test.silver;

import java.util.Scanner;

public class cd_14916 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();   // �Ž��� �� �ݾ� 
		
		int result = -1;	// �ּ� ������ ���� �ʱⰪ�� -1�� ���� 
		
		// ���̽����� ó�� 
		if (n == 1 || n == 3) {
			// 1�� �Ǵ� 3���� 2���� 5������ ���� �� ���� 
			result = -1;
		} else if (n % 5 == 0) {
			// 5�� ������ �������� 5��¥�� ������ ��� 
			result = n / 5; 
		} else if (n % 5 == 1 || n % 5 == 3) {
			// 5�� ���� �������� 1 �Ǵ� 3�̸� 
			result = (n / 5) - 1 + ((n%5) + 5) / 2; 
		} else if (n % 5 == 2 || n % 5 == 4) {
			// 5�� ���� �������� 2 �Ǵ� 4�� 
			result = (n / 5) + (n % 5) / 2;
		}
		
		System.out.println(result);
	}
}
