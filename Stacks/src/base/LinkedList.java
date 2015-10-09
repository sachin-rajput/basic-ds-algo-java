/**
 * 
 */
package base;

/**
 * @author sachin
 *
 */
public abstract class LinkedList {
	
	// Insert operations 
	abstract public void addFront(Object data);

	public void addBack(Object data){
		
	}

	abstract public void addAtPosition(Object data,int position);

	
	// Delete operations
	abstract public boolean deleteFront();
	
	public boolean deleteBack(){
		return false;
	}
	
	abstract public boolean deleteAtPosition(int position);
	
	//Helper operations
	abstract public int length();
	
	abstract public void print();
	
	// Retrieve operations
	abstract public Node getFront();
	
	public Node getBack(){
		return null;
	}
	
	abstract public Node getAtPosition(int position);
	
	abstract public Node get(int dataIn);
	
	abstract public Node get(String dataIn);
		
}




