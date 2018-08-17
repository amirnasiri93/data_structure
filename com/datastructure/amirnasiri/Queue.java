package com.datastructure.amirnasiri;

public class Queue<T> {
	DoublyLinkedList<T> queue;

	public Queue() {
		queue = new DoublyLinkedList<>();
	}

	public void enqueue(NodeDLL<T> element) {
		queue.addBeforeTail(element);
	}

	public NodeDLL<T> dequeue() {
		return queue.removeHead();
	}

	public void display() {
		queue.traverse();
	}

}
