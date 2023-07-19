package a.PGS;

import java.util.HashMap;
import java.util.Map;

public class PGS_추억점수 {

	static class Solution {
	    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
	        int[] answer = new int [photo.length];
	        
	        Map<String, Integer> scoreMap = new HashMap<>();
	        
	        for (int i=0; i<name.length; i++) {
	        	scoreMap.put(name[i], yearning[i]);
	        }
	        
	        for (int i=0; i<photo.length; i++) {
	        	int score = 0;
	        	for (int j=0; j<photo[i].length; j++) {
	        		
	        		if (scoreMap.containsKey(photo[i][j])) {
	        			score += scoreMap.get(photo[i][j]);
	        		}
	        	}
	        	answer[i] += score;
	        }

	        return answer;
	    }
	}
	
	// ["may", "kein", "kain", "radi"]
	// [5, 10, 1, 3]
	// [["may", "kein", "kain", "radi"],["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]]
	// [19, 15, 6]
	
	public static void main(String[] args) {
		
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String [][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		
		Solution.solution(name, yearning, photo);
	}

}
