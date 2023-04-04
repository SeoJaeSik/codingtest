걸린 시간 : 60분
레벨 : 
주제 : 완전탐색

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;



public class Main {
	
	public static int[] list = new int[5];
	public static int min_minus = Integer.MAX_VALUE;
	
	
	public static void permutation(int[] arr, boolean[] visited, int cnt) {
		if(cnt == 5) {
			int maxTeam = Integer.MIN_VALUE;
			int minTeam = Integer.MAX_VALUE;
			
			int team1 = arr[0] + arr[1];
			int team2 = arr[2] + arr[3];
			int team3 = arr[4];
			if(team1 == team2 || team2 == team3 || team1 == team3) {
				return;
			}
			maxTeam = Math.max(team1, Math.max(team2, team3));
			minTeam = Math.min(team1, Math.min(team2, team3));
			 
			min_minus = Math.min(Math.abs(maxTeam-minTeam), min_minus);
		
			return;
		}
		
		for(int i = 0; i < 5; i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[cnt] = list[i];
				permutation(arr, visited, cnt+1);
				visited[i] = false;
			}
		}
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < 5; i++) {
			list[i] = Integer.parseInt(st.nextToken());
			
		}
		
		int[] arr = new int[5];
		boolean[] visited = new boolean[5];
		permutation(arr, visited, 0);
		if(min_minus == Integer.MAX_VALUE ) {
			System.out.println(-1);
		}
		else {
			System.out.println(min_minus);
		}
		
		
	}// end of main(String args[])  -----------------------------
		
	
}      
