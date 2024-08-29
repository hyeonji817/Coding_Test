package com.coding_test.silver;

import java.util.Arrays;
import java.util.Scanner;

public class cd_16435 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // ������ ����
        int L = sc.nextInt(); // �ʱ� ������ũ������ ����

        int[] fruits = new int[N];
        for (int i = 0; i < N; i++) {
            fruits[i] = sc.nextInt();
        }

        // ���� ���� �������� ����
        Arrays.sort(fruits);

        // ������ ���� �� �ִ��� Ȯ��
        for (int i = 0; i < N; i++) {
            if (fruits[i] <= L) {
                L++; // ������ ������ ���� 1 ����
            } else {
                break; // �� �̻� ���� �� ���� ������ ������ ����
            }
        }

        // ��� ���
        System.out.println(L);
	}
}
