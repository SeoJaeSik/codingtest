package a.PGS;

import java.util.Stack;

public class PGS_올바른괄호 {
	static boolean solution(String s) {
        boolean answer = false;
        
        Stack<Character> stack = new Stack<>();
        
        if(s.charAt(0)=='(') {
        	stack.push(s.charAt(0));
        	
        	for (int i=1; i<s.length(); i++) {
        		if (s.charAt(i) == ')') {
        			if (stack.isEmpty()) {
        				continue;
        			}
        			stack.pop();
        		}
        		else {
        			stack.push(s.charAt(i));
        		}
        		System.out.println(stack.toString());
        	}
        	
        	answer = stack.isEmpty();
        	
        }
        System.out.println(answer);
        return answer;
    }
	
//	s			answer
//	"()()"		true
//	"(())()"	true
//	")()("		false
//	"(()("		false

	public static void main(String[] args) {

		solution("(()))(");
	}

}
