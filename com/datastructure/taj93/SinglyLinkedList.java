package com.datastructure.taj93;

public class SinglyLinkedList<T> {
	// the head of the singly linked list.
	private NodeSLL<T> head;

	// constructor
	public SinglyLinkedList() {
		this.head = null;
	}

	// constructor
	public SinglyLinkedList(NodeSLL<T> head) {
		this.head = head;
	}

	public NodeSLL<T> getHead() {
		return head;
	}

	public void setHead(NodeSLL<T> head) {
		this.head = head;
	}

	/**
	 * Traverses and prints out all the elements in the list.
	 */
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

	/**
	 * returns the number of elements in the list.
	 * 
	 * @return
	 */
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

	/**
	 * Inserts an element at the head of the list.
	 * 
	 * @param element
	 */
	public void insertAtHead(NodeSLL<T> element) {
		if (head == null)
			head = element;
		else {
			element.setNext(head);
			this.head = element;
		}
	}

	/**
	 * Inserts an element at the tail of the list.
	 * 
	 * @param element
	 */
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

	/**
	 * Searches for a specific element and returns it if it exists in the list.
	 * 
	 * @param element
	 * @return
	 */
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

	@Override
	public String toString() {
		return "SinglyLinkedList [head=" + head + "]";
	}

}
