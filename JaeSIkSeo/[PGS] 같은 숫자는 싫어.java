package a.PGS;

import java.util.Stack;

public class PGS_같은숫자는싫어 {

	 public int[] solution(int []arr){
		 
        Stack<Integer> stack = new Stack<>();
        
        for (int i : arr) {
        	if(stack.isEmpty()) {
        		stack.push(i);
        	}
        	else {
        		if (stack.peek() != i) {
        			stack.push(i);
        		}
        	}
        }
        
        Object[] obj_arr = stack.toArray();
        int [] int_arr = new int [obj_arr.length];
        
        for (int i=0; i<obj_arr.length; i++) {
        	int_arr[i] = (int)obj_arr[i];
        }
        
        return int_arr;
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
