package com.coding_test.silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class cd_17086 {
	// 8방향 (상, 하, 좌, 우, 대각선 방향)
	static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
	static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};
	static int n, m;
	static int[][] map;
	static int[][] dist;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();	// 배열의 가로 (행) 
		m = sc.nextInt();	// 배열의 세로 (열) 
		map = new int[n][m];	// 생성할 미로 
		dist = new int[n][m];
		
		Queue<int[]> queue = new LinkedList<>();
		
		// 미로 정보 입력 받기 및 상어 위치 큐에 추가 
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
				if (map[i][j] == 1) {
					queue.add(new int[]{i, j});
				}
			}
		}
		
		// BFS 수행 
		bfs(queue);
		
		// 최대 거리 찾기 
		int maxDistance = 0; 
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				maxDistance = Math.max(maxDistance, dist[i][j]);
			}
		}
		
		// 결과 출력 
		System.out.println(maxDistance);
	}

	static void bfs(Queue<int[]> queue) {
		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			int cx = current[0];	// 음.. 이게 뭐지;;
			int cy = current[1];	// 이하동문 
			
			for (int i = 0; i < 8; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				
				// 격자 범위를 벗어나지 않고 아직 방문하지 않은 칸일 경우 
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
