/**
 * 
 */
package linkedlist;

import util.DynamicListStructure;
import util.HashEntry;

/**
 * @author sachin
 *
 */
public class SingleLinkedList implements DynamicListStructure{
	
	Node head = null;
	
	public SingleLinkedList(){
		
	}
	
	@Override
	public void add(Object data) {
		// TODO Auto-generated method stub
		if(head==null){
			head = new Node(data);
		} else {
			Node current = this.head;
			while(current!=null){
				if(current.next==null){
					Node newNode = new Node(data);
					current.next = newNode;
					return;
				}
				current = current.next;
			}
		}
	}

	@Override
	public Object retrieve(String key) {
		// TODO Auto-generated method stub
		if(head==null){
			return null;
		} else {
			Node current = this.head;
			while(current!=null){
				HashEntry obj = (HashEntry)current.data;
				if(obj.getKey().equals(key)){
					return current;
				}
				current = current.next;
			}
			// not found
			return null;
		}
	}

	@Override
	public boolean delete(String key) {
		// TODO Auto-generated method stub
		if(head==null){
			return false;
		} else {
			Node current = this.head;
			Node previous = this.head;
			while(current!=null){
				HashEntry obj = (HashEntry)current.data;
				if(obj.getKey().equals(key)){
					if(current == head){
						if(current.next != null) head = current.next;
						current.next = null;
						return true;
					} else if(current.next == null){
						previous.next = null;
						return true;
					}
					previous.next = current.next;
					current.next = null;
					return true;
				}
				previous = current;
				current = current.next;
			}
			// not found
			return false;
		}
	}

}
