package datastructures.stack;

public class App {
	public static void main(String[] arg) {
		Stack thisStack=new Stack(10);
		thisStack.push(10);
		thisStack.push(20);
		thisStack.push(30);
		thisStack.push(40);
		thisStack.push(50);
		while (!thisStack.isEmpty()) {
			long value=thisStack.pop();	
			System.out.println(value);
		}
	}
}
