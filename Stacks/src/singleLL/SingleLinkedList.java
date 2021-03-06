/**
 * 
 */
package singleLL;

import base.LinkedList;
import base.Node;

/**
 * @author sachin
 * 
 */
public class SingleLinkedList extends LinkedList {
	public Node head = null;
	public Node tail = null; // if this is used as a queue then we need the insertion to be O(1)

	@Override
	public void addFront(Object data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data);
		if (this.head == null && this.tail == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			Node tempHead = this.head;
			newNode.setNext(tempHead);
			this.head = newNode;
		}
	}

	public void addBack(Object data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data);
		if (this.head == null && this.tail == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			Node tempTail = this.tail;
			tempTail.setNext(newNode);
			this.tail = newNode;
		}
	}

	@Override
	public void addAtPosition(Object data, int position) {
		// TODO Auto-generated method stub
		if (position == 0){
			addFront(data);
			return;
		}
		if (position >= this.length()){
			addBack(data);
			return;
		}

		Node newNode = new Node(data);
		if (this.head == null && this.tail == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			Node current = this.head;
			Node previous = this.head;
			int counter = 0;
			while (current != null) {
				if (counter == position) {
					previous.setNext(newNode);
					newNode.setNext(current);
					break;
				}
				previous = current;
				current = current.getNext();
				counter++;
			}

		}
	}


	@Override
	public boolean deleteFront() {
		// TODO Auto-generated method stub
		if(this.head == null && this.tail == null)
			return false;
		else {
			if(head.getNext()==null){
				head = null;
				tail = null;
				return true;
			} else {
				head = head.getNext();
				return true;
			}
		}
	}	

	@Override
	public boolean deleteBack() {
		// TODO Auto-generated method stub
		if(this.head == null)
			return false;
		else{
			if(head.getNext()==null && this.tail == null){
				head = null;
				tail = null;
				return true;
			} else {
				Node current = this.head;
				while(current.getNext()!=null){
					if(current.getNext().getNext()==null){
						current.setNext(null);
						this.tail = current;
						return true;
					}
					current = current.getNext();
				}
				return false;
			}
		}
	}

	@Override
	public boolean deleteAtPosition(int position) {
		// TODO Auto-generated method stub
		if (position == 0){
			return deleteFront();
		}
		if (position == this.length()-1){
			return deleteBack();
		}
		
		if(this.head == null && this.tail == null)
			return false;
		else{
			if(head.getNext()==null){
				head = null;
				tail = null;
				return true;
			} else {
				Node current = this.head;
				Node previous = this.head;
				int counter = 0;
				while(current.getNext()!=null){
					if(counter==position){
						previous.setNext(current.getNext());
						return true;
					}
					previous = current;
					current = current.getNext();
					counter++;
				}
				return false;
			}
		}
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		int counter = 0;
		Node current = this.head;
		while (current != null) {
			counter++;
			current = current.getNext();
		}
		return counter;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		if(this.head==null) return;
		else{
			Node current = this.head;
			while(current!=null){
				System.out.print(current+"-> ");
				current = current.getNext();
			}
		}
		System.out.print("null");
		System.out.println();
	}

	@Override
	public Node getFront() {
		// TODO Auto-generated method stub
		if(this.head == null) return null;
		else{
			return this.head;
		}
	}
	
	public Node getBack(){
		if(this.head == null) return null;
		else{
			return this.tail;
		}
	}

	@Override
	public Node getAtPosition(int position) {
		// TODO Auto-generated method stub
		if(position == 0) return getFront();
		if(position == this.length()-1) return getBack();
		
		if(this.head == null) return null;
		else{
			Node current = this.head;
			int counter = 0;
			while(current != null){
				if(counter == position) 
					return current;
				current = current.getNext();
			}
			return null;
		}
	}

	@Override
	public Node get(int dataIn) {
		// TODO Auto-generated method stub
		
		if(this.head == null) return null;
		else{
			Node current = this.head;
			while(current != null){
				if(dataIn == (Integer)current.getData()) 
					return current;
				current = current.getNext();
			}
			return null;
		}
	}
	
	@Override
	public Node get(String dataIn) {
		// TODO Auto-generated method stub
		
		if(this.head == null) return null;
		else{
			Node current = this.head;
			while(current != null){
				if(dataIn == current.getData().toString()) 
					return current;
				current = current.getNext();
			}
			return null;
		}
	}
	
}
