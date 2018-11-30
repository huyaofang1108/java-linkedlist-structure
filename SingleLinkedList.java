package com.careray.linkedlist2;

public class SingleLinkedList {

	private Node head;

	public SingleLinkedList() {
		super();
		head = null;
	}

	public void append(Object value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			return;
		}
		Node p = this.head;
		while (p.getNext() != null) {
			p = p.getNext();
		}
		p.setNext(newNode);
	}
	
	public void insert(int index, Object value) {
		Node newNode = new Node(value);
		Node p = head;
		for (int i = 0 ; i < index-1; i++) {
			p = p.getNext();
		}
		newNode.setNext(p.getNext());
		p.setNext(newNode);
	}
	
	public void delete(int index) {
		Node p = head;
		for(int i = 0; i < index-1; i++) {
			p = p.getNext();
		}
		p.setNext(p.getNext().getNext());
	}
	
	public void list() {
		Node p = head;
		while (p != null) {
			System.out.println(p.getValue());
			p = p.getNext();
		}
	}
}
