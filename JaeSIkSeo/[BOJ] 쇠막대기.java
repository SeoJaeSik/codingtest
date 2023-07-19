package a.BOJ;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_10799 {

	public static void main(String[] args) {
		// ()(((()())(())()))(()) 17
		// (((()(()()))(())()))(()()) 24
		
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		
		Stack<String> stack = new Stack<>();
		int result = 0;
		
		for (int i=0; i<temp.length(); i++) {
			if (temp.charAt(i) == '(') {
				stack.push("(");
			}
			else {
				if (temp.charAt(i-1) == '(') {
					stack.pop();
					result += stack.size();
				}
				else {
					stack.pop();
					result += 1;
				}
				
			}
		}
		System.out.println(result);
		
		sc.close();
	}

}
