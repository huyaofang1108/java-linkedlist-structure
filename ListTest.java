package com.careray.linkedlist2;

public class ListTest {

	public static void main(String[] args) {
		
		SingleLinkedList slist = new SingleLinkedList();
		slist.append(5);
		slist.append(15);
		slist.append(18);
		slist.append(20);
		slist.insert(1, 10);
		slist.delete(3);
		slist.list();
		
	}
}
