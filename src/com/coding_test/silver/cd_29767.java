package com.coding_test.silver;

import java.util.ArrayList;
import java.util.Scanner;

public class cd_29767 {
	static ArrayList<Integer>[] tree;
    static int[] scores;
    static int[] totalScores;
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 노드의 개수
        int m = sc.nextInt(); // 명령의 개수
        
        tree = new ArrayList[n + 1];
        scores = new int[n + 1];
        totalScores = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }
        
        // 부모 노드 정보로 트리 구성
        for (int i = 2; i <= n; i++) {
            int parent = sc.nextInt();
            tree[parent].add(i);
        }
        
        // 명령 처리
        for (int i = 0; i < m; i++) {
            int type = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (type == 1) {
                scores[x] += y; // x번 노드에 y만큼 점수 추가
            } else if (type == 2) {
                scores[x] -= y; // x번 노드에 y만큼 점수 감산
            }
        }
        
        // DFS로 모든 노드의 최종 점수 계산
        dfs(1);
        
        // 결과 출력
        for (int i = 1; i <= n; i++) {
            System.out.print(totalScores[i] + " ");
        }
	}
	
	// DFS를 통한 점수 계산 및 전파
    static void dfs(int node) {
        totalScores[node] = scores[node]; // 현재 노드의 점수
        for (int child : tree[node]) {
            dfs(child); // 자식 노드 탐색
            totalScores[node] += totalScores[child]; // 자식 노드의 점수를 부모 노드로 전파
        }
    }
}
