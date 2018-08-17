package com.datastructure.amirnasiri;

public class DoublyLinkedList<T> {
	// The head and tail element.
	private NodeDLL<T> head, tail;
	private int size;

	public DoublyLinkedList() {
		tail = null;
		head = null;
		size = 0;
	}

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

	public void removeHead() {
		// if size ==1 then you must change both head and tail.
		if (size == 0) {
			// return null.
		} else if (size == 1) {
			size--;
			head = null;
			tail = null;
			// return head.
		} else {
			size--;
			NodeDLL<T> element = head.getPre();
			element.setNext(null);
			head = element;
		}

	}

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

	public void removeTail() {
		// if size ==1 then you must change both head and tail.
		if (size == 0) {
			// return null.
		} else if (size == 1) {
			size--;
			head = null;
			tail = null;
			// return tail.
		} else {
			size--;
			NodeDLL<T> element = tail.getNext();
			element.setPre(null);
			tail = element;
		}
	}

	public void traverse() {
		if (tail == null) {
		} else {
			NodeDLL<T> current = tail;
			System.out.println(current);
			while (current.hasNext()) {

				current = current.getNext();
				System.out.println(current);
			}
		}
	}

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

}
