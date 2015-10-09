package stacks;

import base.Node;
import singleLL.SingleLinkedList;

public class StackLinklist {
	public SingleLinkedList linkedlist = new SingleLinkedList();
	private Node top;
	private int size;
	private int capacity;

	public StackLinklist() {
		setTop(null);
		setSize(0);
		setCapacity(-1);
	}

	public StackLinklist(int cap) {
		setTop(null);
		setSize(0);
		setCapacity(cap);
	}

	/**
	 * @return the top
	 */
	public Node getTop() {
		return top;
	}

	/**
	 * @param top
	 *            the top to set
	 */
	public void setTop(Node top) {
		this.top = top;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity
	 *            the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void push(Object data) {
		if (this.size == this.capacity) {
			System.out.println("Stack full!");
			return;
		}
		this.linkedlist.addFront(data);
		this.top = this.linkedlist.getFront();
		this.setSize(getSize() + 1);
	}

	public Node pop(Object data) {
		if(this.top == null) return null;
		Node popNode = this.getTop();
		this.top = this.getTop().getNext();
		popNode.setNext(null);
		return popNode;
	}

	public Node peek(){
		if(this.top == null) return null;
		return this.top;
	}
	
	public boolean isEmpty(){
		if(this.top == null) return false;
		return true;
	}
	
	
	
}
