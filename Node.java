
public class Node<T, V> {
	private T data ;
	private Node<T,V> next;
	
	public Node() {
		data =null;
		next = null;
	}
	
	public Node(T data) {
		this.data = data;
	}
	
	public Node(T data, Node<T,V> next) {
		this.data = data;
		this.next = next;
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T, V> getNext() {
		return next;
	}
	public void setNext(Node<T, V> next) {
		this.next = next;
	}
	
	
}
