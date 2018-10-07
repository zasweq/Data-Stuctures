package datastructures;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtHead(5);
		list.insertAtHead(10);
		list.insertAtHead(2);
		list.insertAtHead(12);
		list.insertAtHead(19);
		list.insertAtHead(20);
		
		list.deleteFromHead(); //deletes the 20
		
		System.out.println(list);
		System.out.println("Length: " + list.length());
		
		list.deleteFromHead();
		System.out.println(list);
		
		list.insertAtHead(1000);
		System.out.println(list);
		
		list.insert(32, 3);
		System.out.println("Hello World");
		System.out.println(list);
		System.out.println("Hello World");
		
		
		//Stack demo
		/*Stack stack = new Stack();
		System.out.println(stack.isEmpty());
		stack.push(7);
		stack.push(5);
		stack.push(6);
		stack.push(10);
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek()); //will output number twice because it peeks then pops
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());*/
		
	}
}
