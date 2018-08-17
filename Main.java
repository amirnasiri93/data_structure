public class Main {
	public static void main(String[] args) {

		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

		list.insertAtTail(new NodeSLL<>(1));
		list.insertAtTail(new NodeSLL<>(2));
		list.insertAtTail(new NodeSLL<>(3));
		list.insertAtTail(new NodeSLL<>(4));
		list.insertAtTail(new NodeSLL<>(5));
		list.traverse();
		System.out.println(list.size());
		list.insertAtHead(new NodeSLL<>(12));

		NodeSLL a = list.search(new NodeSLL<Integer>(12));
		System.out.println(a);
		if (a.hasNext()) {
			System.out.println(a.getNext());
		}
		System.out.println();
		list.traverse();
		System.out.println(list.size());

	}
}