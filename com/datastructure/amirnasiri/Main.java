package com.datastructure.amirnasiri;

public class Main {
	public static void main(String[] args) {
		// Singly Linked-List:
		// SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		// list.insertAtTail(new NodeSLL<>(1));
		// list.insertAtTail(new NodeSLL<>(2));
		// list.insertAtTail(new NodeSLL<>(3));
		// list.insertAtTail(new NodeSLL<>(4));
		// list.insertAtTail(new NodeSLL<>(5));
		// list.traverse();
		// System.out.println(list.size());
		// list.insertAtHead(new NodeSLL<>(12));
		// NodeSLL a = list.search(new NodeSLL<Integer>(12));
		// System.out.println(a);
		// if (a.hasNext()) {
		// System.out.println(a.getNext());
		// }
		// System.out.println();
		// list.traverse();
		// System.out.println(list.size());

		// STACK:
		// StackCDT<String> stack = new StackCDT<>();
		// System.out.println(stack.top() + " " + stack.size());
		// stack.push("a");
		// System.out.println(stack.top() + " " + stack.size());
		// stack.push("b");
		// System.out.println(stack.top() + " " + stack.size());
		// stack.pop();
		// System.out.println(stack.top() + " " + stack.size());
		// stack.pop();
		// System.out.println(stack.top() + " " + stack.size());
		// System.out.println();
		// System.out.println(stack.top() + " " + stack.size());
		// stack.push("a");
		// System.out.println(stack.top() + " " + stack.size());
		// stack.push("b");
		// System.out.println(stack.top() + " " + stack.size());
		// stack.pop();
		// System.out.println(stack.top() + " " + stack.size());
		// stack.pop();
		// System.out.println(stack.top() + " " + stack.size());

		// Doubly Linked List:
		DoublyLinkedList<String> list = new DoublyLinkedList<>();
		list.addBeforeTail(new NodeDLL<String>("H1"));
		list.addBeforeTail(new NodeDLL<String>("H2"));
		list.addAfterHead(new NodeDLL<String>("H3"));
		list.addAfterHead(new NodeDLL<String>("H4"));
		list.addBeforeTail(new NodeDLL<String>("H0"));
		list.traverse();
		list.removeTail();
		System.out.println("\n\n");
		list.traverse();

		list.removeHead();
		System.out.println("\n\n");
		list.traverse();
	}
}