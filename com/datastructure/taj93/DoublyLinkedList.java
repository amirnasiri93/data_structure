package com.datastructure.taj93;

public class DoublyLinkedList<T> {
	// The head and tail element.
	private NodeDLL<T> head, tail;
	private int size;

	// constructor
	public DoublyLinkedList() {
		tail = null;
		head = null;
		size = 0;
	}

	// add a node after node.
	public void addAfterHead(NodeDLL<T> element) {
		size++;
		if (head == null && tail == null) {
			tail = element;
			head = element;
		} else {
			element.setPre(head);
			head.setNext(element);
			head = element;
		}
		/**
		 * System.out.println("head: " + head.getData()); if (head.getNext() != null) {
		 * System.out.println("next: " + head.getNext().getData()); } if (head.getPre()
		 * != null) { System.out.println("pre: " + head.getPre().getData()); }
		 */
		// System.out.println(tail + " " + head);
		// System.out.println("next: " + tail.getNext() + " pre:" + head.getPre() +
		// "\n");
	}

	// remove a node after head.
	public NodeDLL<T> removeHead() {
		// if size ==1 then you must change both head and tail.
		if (size == 0) {
			return null;
		} else if (size == 1) {
			size--;
			NodeDLL<T> temp = tail;
			head = null;
			tail = null;
			return temp;
		} else {
			size--;
			NodeDLL<T> temp = head;
			NodeDLL<T> element = head.getPre();
			element.setNext(null);
			head = element;
			return temp;
		}

	}

	// add a node before tail
	public void addBeforeTail(NodeDLL<T> element) {
		size++;
		if (head == null && tail == null) {
			tail = element;
			head = element;
		} else {
			element.setNext(this.tail);
			tail.setPre(element);
			tail = element;
		}
		/**
		 * System.out.println("tail: " + tail.getData()); if (tail.getNext() != null) {
		 * System.out.println("next: " + tail.getNext().getData()); } if (tail.getPre()
		 * != null) { System.out.println("pre: " + tail.getPre().getData()); }
		 */
		// System.out.println(tail + " " + head);
		// System.out.println("next: " + tail.getNext() + " pre:" + head.getPre() +
		// "\n");
	}

	// remove the tail
	public NodeDLL<T> removeTail() {
		// if size ==1 then you must change both head and tail.
		if (size == 0) {
			return null;
		} else if (size == 1) {
			size--;
			NodeDLL<T> temp = tail;
			head = null;
			tail = null;
			return temp;
		} else {
			size--;
			NodeDLL<T> element = tail.getNext();
			element.setPre(null);
			NodeDLL<T> temp = tail;
			tail = element;
			return temp;
		}
	}

	// it prints all the elements in the list.
	public void traverse() {
		if (tail == null) {
			System.out.println("There are no elements in the list.");
		} else {

			NodeDLL<T> current = tail;
			System.out.println(current);
			while (current.hasNext()) {
				current = current.getNext();
				System.out.println(current);
			}

		}
	}

	// returns the size of the list.
	public int size() {
		return size;
	}

	// -----------getters and setters-----------------
	public NodeDLL<T> getHead() {
		return head;
	}

	public void setHead(NodeDLL<T> head) {
		this.head = head;
	}

	public NodeDLL<T> getTail() {
		return tail;
	}

	public void setTail(NodeDLL<T> tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
