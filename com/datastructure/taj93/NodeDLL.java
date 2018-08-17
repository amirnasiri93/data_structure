package com.datastructure.taj93;

public class NodeDLL<T> {
	// the data
	private T data;
	// link to previous and next node.
	private NodeDLL<T> next, pre;

	// constructor
	public NodeDLL() {
		data = null;
		next = null;
		pre = null;
	}

	// constructor
	public NodeDLL(T data) {
		this.data = data;
		this.next = null;
		this.pre = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public NodeDLL<T> getNext() {
		return next;
	}

	public void setNext(NodeDLL<T> next) {
		this.next = next;
	}

	public NodeDLL<T> getPre() {
		return pre;
	}

	public void setPre(NodeDLL<T> pre) {
		this.pre = pre;
	}

	public boolean hasNext() {
		if (next == null)
			return false;
		else
			return true;
	}

	public boolean hasPre() {
		if (pre == null)
			return false;
		else
			return true;
	}

	@Override
	public String toString() {
		return "NodeDLL [data=" + data + ", next=" + hasNext() + ", pre=" + hasPre() + "]";
	}

}
