package datastructures.stack;

public class Stack {
	
	private int maxsize;
	private long[] stackArray;
	private int top;

	public Stack(int size) {
		this.maxsize=size;
		this.stackArray=new long[size];
		this.top=-1;
	}

	public void push(long j) {
		if(isFull()) {
			System.out.println("Stack size is full");
		}else {
			top++;
			stackArray[top]=j;
		}
	}
	public long pop() {
		if(isEmpty()) {
			System.out.println("Stack size is empty");
			return 0;
		}else {
			int old_top=top;
			top--;
			return stackArray[old_top];
		}
	}
	
	public long peak() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top==-1);
	}

	private boolean isFull() {
		return (maxsize-1==top);
	}
}
