package a.BOJ;

import java.util.Scanner;

public class BOJ_4963 {

	static boolean [][] visited;
						// 3 	   6       9 	  12
	static int[] dx = new int [] {1,  1,  0, -1, -1, -1, 0,  1};
	static int[] dy = new int [] {0, -1, -1, -1,  0,  1, 1,  1};
	static int width;
	static int height;
	static int [][] map;
	
	static void DFS(int x, int y) {
		visited[x][y] = true;
		
		for (int i=0; i<8; i++) {
			int nowX = x + dx[i];
			int nowY = y + dy[i];
			
			if (nowX >= 0 && nowY >= 0 && nowX < height && nowY < width) {
				if(map[nowX][nowY] == 1 && visited[nowX][nowY] == false) {
					DFS(nowX,nowY);
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int count;	
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			width = sc.nextInt();
			height = sc.nextInt();
			
			if ( !(width == 0 && height == 0) ) {
				
				map = new int [height][width];
				visited = new boolean [height][width];
				count = 0;

				for (int i=0; i<height; i++) {
					for (int j=0; j<width; j++) {
						map[i][j] = sc.nextInt();
					}
				}
				
				for (int i=0; i<height; i++) {
					for (int j=0; j<width; j++) {
						if ( map[i][j] == 1 && visited[i][j] == false) {
							DFS(i,j);
							count++;
						}
					}
				}
			
				System.out.println(count);
			}
			else {
				break;
			}
			
		}
		sc.close();
	}

}

