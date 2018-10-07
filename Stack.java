package datastructures;
//Stacks and Queues are data structures that are abstract-conceptual
//Push-Inserts an element onto the stack at the top of the stack
//pop-removes the topmost element of the stack and returns it
//Peek-Reads the value of the topmost element without removing it
//LIFO-Last in, First out
public class Stack {
	private int[] items = new int[100]; //this can be whatever, how long you want your stack to be
	private int top = -1; //index to keep track of the topmost element
	
	//all of these methods have runtime n(1)

	public void push(int item) {
		if (top == items.length-1) {
			throw new RuntimeException("Stack is full");
		}
		items[(top+1)] = item;
		top++;
	}
	
	//returns top of the stack, and removes it

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		top--; //top goes down one
		return items[top+1]; //have to add one since you subtracted by 1 earlier;
	}

	//returns top of the stack, does not remove it
	public int peek() {
		if (isEmpty())
			throw new RuntimeException("Stack is empty");
		return items[top]; //returns top, does not change top variable
	}

	
	public boolean isEmpty() { //if empty, will be null
		return (top < 0);
	}

}
