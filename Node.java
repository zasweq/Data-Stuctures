package datastructures;

public class Node {
	private int data; //nodes in linked list have data and a pointer
	private Node nextNode;
	
	public Node(int data) {
		this.data = data;
	}
	
	public int getData(){ //getters
		return this.data;
	}
	
	public Node getnextNode() {
		return this.nextNode;
	}
	
	public void setData(int data) { //setters
		this.data = data;
	}
	
	public void setNextNode(Node nextNode){
		this.nextNode = nextNode;
	}
	
	@Override
	public String toString() {
		return "Data: " + this.data;
	}

}
