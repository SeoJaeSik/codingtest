import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	
	public char pushCharcter(char c, int n) {
		int offset = Character.isUpperCase(c) ? 'A' : 'a';
		int position = c - offset;
		
		position += n;
		position = position % ('Z' - 'A' + 1);
		
		
		return (char)(position+offset);
	}
	
	public String solution(String s, int n) {
        
    	
		StringBuilder sb = new StringBuilder();
		
		for(char c : s.toCharArray()) {
			if(!Character.isAlphabetic(c)) {
				sb.append(c);
			}
			else {
				sb.append(pushCharcter(c, n));
			}
		}
		return sb.toString();
    }
}