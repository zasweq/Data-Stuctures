package datastructures;

public class LinkedList {
	private Node head; //only contains one node, the head element
	//If you initalize a node without a pointer, java simply points it to null, this is why first node you add to linked list will point to null
	//o1 runtime to insert new node at head, constant, you simply put one in
	public void insertAtHead (int data) {
		Node newNode = new Node (data); //first create a new node object
		newNode.setNextNode(this.head); //sets the link to the next node as this current node, keeps it in the list
		this.head = newNode; //new node points to this
	}
	
	public int length() { //Length, will go through it until it reaches null
		int length = 0;
		Node current = this.head;
		
		while(current != null) {
			length++;
			current = current.getnextNode(); //the current one, not the head
		}
		return length;
	}
	
	@Override
	public String toString() {
		String result = "{";
		Node current  = this.head;
		
		while(current != null) { //the last one will be a null pointer, the first one implemented
			result += current.toString() +" ";
			current = current.getnextNode(); //Go to next node
		}
		result+="}";
		return result;
	}
	
	//Delete the head node-Simply make the pointer point to the next node in the list, java garbage collects and deletes last node anyway, can never access that node
	//01 runtime
	public void deleteFromHead() {
		this.head = this.head.getnextNode();
	}
	
	//search for an item through a linkedlist, have to go through all nodes until you find element you are searching for
	//On runtime, linear
	
	public Node find(int data) {
		Node current = this.head;
		while (current!=null) { //Key code to program, will go through linked list
			if(current.getData()==data) {
				return current;
			} //if this doesn't execute, go to the next node
			current = current.getnextNode();
		}
		return null; //if this doesn't find anything in the linked list, return null
	}
	
	
	//For inserting into sorted, compare the data to the next nodes data, as once you go forward you can never go back
	//However, this one is simply insert by position
	public void insert(int data, int position) {
		if(position<0||position>this.length()) {
			throw new IllegalArgumentException("Position must be within list.");
		}
		
		Node current = this.head;
		int length = this.length();
		Node newNode = new Node(data); //create the new node
		Node nextNode = current.getnextNode(); //stores it so new node can now point to it
		for(int i=0; i<length; i++) { //iterates through list until i = index specified
			//System.out.println("Test");
			
			if(i==(position-1)) {
				current.setNextNode(newNode); //set next node to the new node of the current
				newNode.setNextNode(nextNode); //set this node we just created to point to the node the old node currently pointed to
				//System.out.println("Test");
				break;
			}
			current = nextNode;
			nextNode = current.getnextNode(); //the next node is the current.get next node
		}
	}
	
}
