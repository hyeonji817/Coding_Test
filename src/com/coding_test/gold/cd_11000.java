package com.coding_test.gold;

import java.util.*;

public class cd_11000 {
	public static void main(String[] args) {
		try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();  // ������ ���� 
            int[][] lectures = new int[n][2];
            
            // ������ ���� �ð��� ���� �ð� �Է� 
            for (int i = 0; i < n; i++) {
                lectures[i][0] = sc.nextInt();   // ���� �ð� 
                lectures[i][1] = sc.nextInt();   // ���� �ð� 
            }
            
            // ���Ǹ� ���� �ð� �������� ���� 
            Arrays.sort(lectures, Comparator.comparingInt(o -> o[0]));
            
            // �켱���� ť (Min-Heap) ���� - ���� �ð��� ���� 
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            
            // ù ��° ���� ���� �ð��� ť�� �߰� 
            pq.offer(lectures[0][1]);
            
            // ��� ���Ǹ� ��ȸ�ϸ� ���ǽ� ���� 
            for (int i = 1; i < n; i++) {
                // ���� ���� ������ ���ǿ� ���� ������ ���� �ð��� �� 
                if (lectures[i][0] >= pq.peek()) {
                    pq.poll();       // ��� ���� ���ǽǿ��� ���� ���� ������ ���Ǹ� ���� 
                }
                // ���� ������ ���� �ð��� ť�� �߰� 
                pq.offer(lectures[i][1]);
            }
            
            // �ʿ��� �ּ� ���ǽ��� ���� ť�� ũ��� ���� 
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
