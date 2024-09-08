package com.coding_test.silver;

import java.util.ArrayList;
import java.util.Scanner;

public class cd_29767 {
	static ArrayList<Integer>[] tree;
    static int[] scores;
    static int[] totalScores;
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // ����� ����
        int m = sc.nextInt(); // ����� ����
        
        tree = new ArrayList[n + 1];
        scores = new int[n + 1];
        totalScores = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }
        
        // �θ� ��� ������ Ʈ�� ����
        for (int i = 2; i <= n; i++) {
            int parent = sc.nextInt();
            tree[parent].add(i);
        }
        
        // ��� ó��
        for (int i = 0; i < m; i++) {
            int type = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (type == 1) {
                scores[x] += y; // x�� ��忡 y��ŭ ���� �߰�
            } else if (type == 2) {
                scores[x] -= y; // x�� ��忡 y��ŭ ���� ����
            }
        }
        
        // DFS�� ��� ����� ���� ���� ���
        dfs(1);
        
        // ��� ���
        for (int i = 1; i <= n; i++) {
            System.out.print(totalScores[i] + " ");
        }
	}
	
	// DFS�� ���� ���� ��� �� ����
    static void dfs(int node) {
        totalScores[node] = scores[node]; // ���� ����� ����
        for (int child : tree[node]) {
            dfs(child); // �ڽ� ��� Ž��
            totalScores[node] += totalScores[child]; // �ڽ� ����� ������ �θ� ���� ����
        }
    }
}
