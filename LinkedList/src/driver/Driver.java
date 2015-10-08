package driver;

import singleLL.SingleLinkedList;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList sll = new SingleLinkedList();
		sll.addFront(2);
		sll.print();
		
		sll.addFront(3);
		sll.print();
		sll.addBack(6);
		sll.print();
		System.out.println("length is " + sll.length());
		sll.addAtPosition("sachin", 3);
		sll.addAtPosition(21,4);
		System.out.println(sll.get("sachin"));
		sll.print();
		sll.deleteAtPosition(2);
		sll.print();
		sll.deleteFront();
		sll.print();
		sll.deleteBack();
		sll.print();
		
	}

}
