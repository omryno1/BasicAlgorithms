package Stack;

public class Stack {
	private int maxValue;
	private int top;
	private int[] stackArr;
	
	public Stack (int size){
		maxValue = size;
		stackArr = new int[maxValue];
		top = -1;
	}
	
	public void push (int num){
		if (top < maxValue -1){
			stackArr[++top] = num;
		}else System.out.println("Stack is full!");
	}
	
	public int pop (){
		if (top > -1){
			return stackArr[top--];
		}
		return -1;
	}
	
	public Boolean isEmpty(){
		if (top == -1){
			return true;
		}
		return false;
	}
	
	public Boolean isFull(){
		if (top == maxValue -1){
			return true;
		}
		return false;
	}
	
	public int pick(){
		if (top != -1){
			return stackArr[top];
		}
		return -1;
	}
}
