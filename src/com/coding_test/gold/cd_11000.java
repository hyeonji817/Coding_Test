package com.coding_test.gold;

import java.util.*;

public class cd_11000 {
	public static void main(String[] args) {
		try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();  // 강의의 개수 
            int[][] lectures = new int[n][2];
            
            // 강의의 시작 시간과 종료 시간 입력 
            for (int i = 0; i < n; i++) {
                lectures[i][0] = sc.nextInt();   // 시작 시간 
                lectures[i][1] = sc.nextInt();   // 종료 시간 
            }
            
            // 강의를 시작 시간 기준으로 정렬 
            Arrays.sort(lectures, Comparator.comparingInt(o -> o[0]));
            
            // 우선순위 큐 (Min-Heap) 생성 - 종료 시간을 관리 
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            
            // 첫 번째 강의 종료 시간을 큐에 추가 
            pq.offer(lectures[0][1]);
            
            // 모든 강의를 순회하며 강의실 배정 
            for (int i = 1; i < n; i++) {
                // 가장 빨리 끝나는 강의와 현재 강의의 시작 시간을 비교 
                if (lectures[i][0] >= pq.peek()) {
                    pq.poll();       // 사용 중인 강의실에서 가장 빨리 끝나는 강의를 제거 
                }
                // 현재 강의의 종료 시간을 큐에 추가 
                pq.offer(lectures[i][1]);
            }
            
            // 필요한 최소 강의실의 수는 큐의 크기와 동일 
            System.out.println(pq.size());
        } catch (NoSuchElementException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
	}
}
