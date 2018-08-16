import java.util.ArrayList;

public class Stack<T> {
	private ArrayList<T> stack;

	public Stack() {
		stack = new ArrayList<>();
	}

	/**
	 * This method returns the element at the top of the stack.
	 */
	public T top() throws StackEmptyException {
		if (stack.size() == 0) {
			throw new StackEmptyException("The stack is empty!");
		} else
			return stack.get(stack.size() - 1);
	}

	/**
	 * This operation pushes an element at the top of the stack.
	 * 
	 * @param elem
	 */
	public void push(T elem) {
		stack.add(elem);
		//System.out.println("element '" + elem + "' added to the stack.");
	}

	/**
	 * This operation pops the element from the top of the stack.
	 * 
	 * @return
	 */
	public T pop() {
		if (stack.isEmpty()) {
			return null;
		} else {
			T elem = stack.get(stack.size() - 1);
			stack.remove(elem);
			return elem;
		}
	}

	public int size() {
		return stack.size();
	}

	public boolean isEmpty() {
		if (stack.isEmpty()) {
			return true;
		} else
			return false;

	}

}