import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(long n) {
        
        StringBuilder sb = new StringBuilder(); 
        while(n > 0) {
        	
        	sb.append(n%10);
        	n = n/10;
        }
       String tmp = sb.toString();
       int[] arr  = new int[sb.length()];
       
       for(int i = 0; i < arr.length; i++) {
    	   
    	   arr[i] = (int)(tmp.charAt(i)-'0');
       }
       return arr;
        
    }
}