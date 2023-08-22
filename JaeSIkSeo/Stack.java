package a.BOJ;

// 배열로 스택 구현하기
public class Stack {

	private int size; // 스택 배열의 크기
	private int index; // 스택의 인덱스
	private int [] Stack;
	
	public Stack (int size) {
		this.size = size;
		Stack = new int [size];
		index = -1;
	}
	
	public void push(int num) {
		if(isFull()) {
			System.out.println("Stack is Full !");
			return;
		}
		Stack[++index] = num;
		System.out.println("push !");
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty !");
			return;
		}
		int num = Stack[index--];
		System.out.println("pop ! return = "+num);
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty !");
			return;
		}
		System.out.println("peek ! "+Stack[index]);
	}
	
	public void clear() {
		if(isEmpty()) {
			System.out.println("Stack is already Empty !");
			return;
		}
		index = -1;
		Stack = new int [this.size];
		System.out.println("Stack is Clear !");
	}
	
	public boolean isEmpty() {
		return (index == -1);
	}
	
	public boolean isFull() {
		return (index == this.size-1);
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("Stack is Empty !");
			return;
		}
		for (int i=0; i<=index; i++) {
			System.out.println(Stack[i]+" ");
		}
	}
	
	public static void main(String[] args) {

		Stack stack = new Stack(5);
		stack.push(3);
		stack.push(5);
		stack.push(2);
		stack.push(6);
		stack.push(7);
		stack.push(7);
		stack.printStack();
	}

}
