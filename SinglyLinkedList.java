
public class SinglyLinkedList {
	private Node first; 
	
	public SinglyLinkedList() {
		first =null;
	}
	
	public SinglyLinkedList(Node first) {
		this.first = first; 
	}
	
	
	public boolean isEmpty() {
		if(first ==null) {
			return false;
		}
		else return true;
	}
	
	public int size() {
		Node elem = first;
		int counter = 0;
		
		while (elem != null) {
			counter++;
			elem = elem.getNext();
		}
		return counter;
	}
	
	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public void add(Node node, Object object) {
		
	}
	
	
	

}
