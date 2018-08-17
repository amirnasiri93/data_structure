package com.datastructure.amirnasiri;

public class NodeSLL<T> {
	private T data;
	private NodeSLL<T> next;

	// constructor
	public NodeSLL() {
		this.data = null;
		this.next = null;
	}

	// constructor
	public NodeSLL(T data) {
		this.data = data;
		this.next = null;
	}

	// constructor
	public NodeSLL(T data, NodeSLL<T> next) {
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public NodeSLL<T> getNext() {
		return next;
	}

	public void setNext(NodeSLL<T> next) {
		this.next = next;
	}

	public boolean hasNext() throws NullPointerException {
		if (this.next == null)
			return false;
		else
			return true;
	}

	@Override
	public String toString() {
		return "NodeSLL [data=" + data + " hasNext: " + this.hasNext() + "]";
	}

}
