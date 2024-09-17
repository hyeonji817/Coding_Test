package com.coding_test.silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class cd_2178 {
	// 방향 벡터 (상, 하, 좌, 우)
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int n, m; 
	static int[][] maze;
	static boolean[][] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();	// 가로인듯
		m = sc.nextInt();	// 세로인듯
		maze = new int[n][m];	// 생성할 미로 
		visited = new boolean[n][m];	// 방문한 횟수 
		
		// 미로 정보 입력 받기 
		for (int i = 0; i < n; i++) {
			String line = sc.next();
			for (int j = 0; j < m; j++) {
				maze[i][j] = line.charAt(j) - '0';
			}
		}
		
		// BFS 수행 및 결과 출력 
		System.out.println(bfs(0, 0));
	}
	
	static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();	// 큐 생성 
		queue.add(new int[] {x, y});	// 큐 추가 
		visited[x][y] = true; 	
		
		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			int cx = current[0];
			int cy = current[1];
			
			// 네 방향으로 이동할 수 있는지 체크 
			for (int i = 0; i < 4; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				
				// 미로 범위를 벗어나지 않고, 방문하지 않았으며, 이동 가능한 경우 
				if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if (!visited[nx][ny] && maze[nx][ny] == 1) {
						// 큐에 다음 위치 추가 
						queue.add(new int[] {nx, ny});
						// 방문 처리 
						visited[nx][ny] = true;
						// 거리 갱신
						maze[nx][ny] = maze[cx][cy] + 1; 
					}
				}
			}
		}
		
		// 도착지점의 거리 반환 
		return maze[n - 1][m - 1];
	}
}
