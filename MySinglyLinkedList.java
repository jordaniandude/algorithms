// This is a simple implementation of a singly linked list.

public class MySinglyLinkedList<V> {
	Node head;

	public MySinglyLinkedList() {

	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void add(V value) {

		Node node = new Node(value);

		node.next = head;
		head = node;

	}

	public Node remove(V value) {
		Node previous = null;
		Node current = head;
		while (current.value != value) {
			if (current.next == null) {
				return null;
				// no match, get out.
			}
			previous = current;
			current = current.next;
		}
		// we have a match
		if (previous == null) {// this means the link we are trying to remove is
								// the head.
			head = head.next;
		} else {
			previous.next = current.next;
		}

		return head;
	}

	public void print() {
		while (head != null) {
			System.out.println(head.value + " ");
			head = head.next;
		}
		System.out.println();

	}

	public class Node {
		Node next;
		V value;

		public Node(V value) {
			this.value = value;
		}
	}
}
