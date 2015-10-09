package stacks;

public class Stack {
	private Object[] data;
	private int top;
	private int capacity;


	public Stack(int cap) {
		setCapacity(cap);
		setSize(-1);
	}

	/**
	 * @return the top
	 */
	public Object getTop() {
		return this.data[top];
	}


	/**
	 * @return the size
	 */
	public int getSize() {
		return top;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(int size) {
		this.top = size;
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
		if(capacity<0)
			this.data = new Object[0];
		else
			this.data = new Object[capacity];
		this.capacity = capacity;
	}

	public void push(Object dataIn) {
		if (this.isFull()) {
			System.out.println("Stack full!");
			return;
		}
		this.data[++top] = dataIn;
	}

	public Object pop() {
		return this.data[top--];
	}

	public Object peek(){
		return this.data[top];
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top == capacity-1);
	}
	
	
	
}
