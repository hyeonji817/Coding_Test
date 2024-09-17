package com.coding_test.silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class cd_2178 {
	// ���� ���� (��, ��, ��, ��)
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int n, m; 
	static int[][] maze;
	static boolean[][] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();	// �����ε�
		m = sc.nextInt();	// �����ε�
		maze = new int[n][m];	// ������ �̷� 
		visited = new boolean[n][m];	// �湮�� Ƚ�� 
		
		// �̷� ���� �Է� �ޱ� 
		for (int i = 0; i < n; i++) {
			String line = sc.next();
			for (int j = 0; j < m; j++) {
				maze[i][j] = line.charAt(j) - '0';
			}
		}
		
		// BFS ���� �� ��� ��� 
		System.out.println(bfs(0, 0));
	}
	
	static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();	// ť ���� 
		queue.add(new int[] {x, y});	// ť �߰� 
		visited[x][y] = true; 	
		
		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			int cx = current[0];
			int cy = current[1];
			
			// �� �������� �̵��� �� �ִ��� üũ 
			for (int i = 0; i < 4; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				
				// �̷� ������ ����� �ʰ�, �湮���� �ʾ�����, �̵� ������ ��� 
				if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if (!visited[nx][ny] && maze[nx][ny] == 1) {
						// ť�� ���� ��ġ �߰� 
						queue.add(new int[] {nx, ny});
						// �湮 ó�� 
						visited[nx][ny] = true;
						// �Ÿ� ����
						maze[nx][ny] = maze[cx][cy] + 1; 
					}
				}
			}
		}
		
		// ���������� �Ÿ� ��ȯ 
		return maze[n - 1][m - 1];
	}
}
