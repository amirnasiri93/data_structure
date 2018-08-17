package com.datastructure.amirnasiri;
/**
 * @author amirnasiri This class creates a StackCDT. Date: 17/08/18
 */

public class StackCDT<T> {

	// the size of the array starts with 10 and then we add 10 each time it becomes
	// full.
	private Object[] array;
	private int top;
	private int current_array_length;

	public StackCDT() {
		this.array = new Object[10];
		this.top = -1;
		this.current_array_length = 10;
	}

	/**
	 * Pushes an element into the stack.
	 * 
	 * @param elem
	 */
	public void push(T elem) {

		if (array.length == current_array_length) {
			Object[] myArray = new Object[array.length + 10];
			current_array_length = array.length + 10;
			int counter = 0;
			for (Object obj : array) {
				myArray[counter] = obj;
				counter++;
			}
			array = myArray;
		}
		top++;
		array[top] = elem;
		// System.out.println("top: " + top);
	}

	/**
	 * returns and pops the element on top of the stack.
	 * 
	 * @return
	 */
	public Object pop() {
		if (top == -1)
			return null;
		else {
			Object temp = array[top];
			array[top] = null;
			top--;
			return temp;
		}
	}

	/**
	 * returns the element on top of the stack.
	 * 
	 * @return
	 */
	public Object top() {
		if (top == -1)
			return null;
		else {
			Object temp = array[top];
			return temp;
		}
	}

	/**
	 * returns true if the stack is empty.
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	/**
	 * returns the number of elements in the stack.
	 * 
	 * @return
	 */
	public int size() {
		if (top == -1) {
			return 0;
		} else {
			return top + 1;
		}
	}
}
