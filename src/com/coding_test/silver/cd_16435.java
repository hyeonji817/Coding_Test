package com.coding_test.silver;

import java.util.Arrays;
import java.util.Scanner;

public class cd_16435 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 과일의 개수
        int L = sc.nextInt(); // 초기 스네이크버드의 길이

        int[] fruits = new int[N];
        for (int i = 0; i < N; i++) {
            fruits[i] = sc.nextInt();
        }

        // 과일 높이 오름차순 정렬
        Arrays.sort(fruits);

        // 과일을 먹을 수 있는지 확인
        for (int i = 0; i < N; i++) {
            if (fruits[i] <= L) {
                L++; // 과일을 먹으면 길이 1 증가
            } else {
                break; // 더 이상 먹을 수 없는 과일이 나오면 종료
            }
        }

        // 결과 출력
        System.out.println(L);
	}
}
