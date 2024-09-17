package com.coding_test.silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class cd_17086 {
	// 8���� (��, ��, ��, ��, �밢�� ����)
	static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
	static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};
	static int n, m;
	static int[][] map;
	static int[][] dist;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();	// �迭�� ���� (��) 
		m = sc.nextInt();	// �迭�� ���� (��) 
		map = new int[n][m];	// ������ �̷� 
		dist = new int[n][m];
		
		Queue<int[]> queue = new LinkedList<>();
		
		// �̷� ���� �Է� �ޱ� �� ��� ��ġ ť�� �߰� 
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
				if (map[i][j] == 1) {
					queue.add(new int[]{i, j});
				}
			}
		}
		
		// BFS ���� 
		bfs(queue);
		
		// �ִ� �Ÿ� ã�� 
		int maxDistance = 0; 
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				maxDistance = Math.max(maxDistance, dist[i][j]);
			}
		}
		
		// ��� ��� 
		System.out.println(maxDistance);
	}

	static void bfs(Queue<int[]> queue) {
		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			int cx = current[0];	// ��.. �̰� ����;;
			int cy = current[1];	// ���ϵ��� 
			
			for (int i = 0; i < 8; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				
				// ���� ������ ����� �ʰ� ���� �湮���� ���� ĭ�� ��� 
				if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if (map[nx][ny] == 0 && dist[nx][ny] == 0) {
						dist[nx][ny] = dist[cx][cy] + 1;
						queue.add(new int[] {nx, ny});
					}
				}
			}
		}
	}
}
