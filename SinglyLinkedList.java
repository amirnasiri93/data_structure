
public class SinglyLinkedList<T> {

	private NodeSLL<T> head;

	public SinglyLinkedList() {
		this.head = null;
	}

	public SinglyLinkedList(NodeSLL<T> head) {
		this.head = head;
	}

	public NodeSLL<T> getHead() {
		return head;
	}

	public void setHead(NodeSLL<T> head) {
		this.head = head;
	}

	public void traverse() {
		if (head == null)
			System.out.println("No element exists in the list.");
		else {
			NodeSLL<T> current = head;
			// System.out.println(current);
			while (current.getNext() != null) {
				System.out.println(current);
				current = current.getNext();
			}
			System.out.println(current);
		}

	}

	public int size() {
		int counter = 0;
		if (head == null) {
			return 0;
		} else {
			NodeSLL<T> current = head;
			counter = 1;
			while (current.hasNext()) {
				counter++;
				current = current.getNext();
			}

		}

		return counter;
	}

	public void insertAtHead(NodeSLL<T> element) {
		if (head == null)
			head = element;
		else {
			element.setNext(head);
			this.head = element;
		}
	}

	public void insertAtTail(NodeSLL<T> element) {
		if (head == null)
			head = element;
		else {
			NodeSLL<T> tail = head;
			while (tail.hasNext()) {
				tail = tail.getNext();
			}
			tail.setNext(element);
		}

	}

	@Override
	public String toString() {
		return "SinglyLinkedList [head=" + head + "]";
	}

	public NodeSLL<T> search(NodeSLL<T> element) {
		if (head == null) {
			return null;
		} else {
			NodeSLL<T> current = head;
			while (current.hasNext()) {
				if (current.getData().equals(element.getData())) {
					return current;
				}
				current = current.getNext();
			}
			// checking the last one...
			if (current.getData().equals(element.getData())) {
				return current;
			}
			return null;
		}
	}

}
