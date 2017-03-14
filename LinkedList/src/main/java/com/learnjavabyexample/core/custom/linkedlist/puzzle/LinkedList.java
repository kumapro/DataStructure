package com.learnjavabyexample.core.custom.linkedlist.puzzle;

public class LinkedList {
	
	private Node head;
	private Node tail;
	private int size;
	
	static class Node {
		Integer data;
		Node next;

		public Node() {

		}

		public Node(Integer data) {
			this.data = data;
		}

		public Integer getData() {
			return data;
		}

		public void setData(Integer data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return this.data.toString();
		}
	}

	public void add(Integer data) {
		Node node = new Node(data);
		if (head != null) {
			tail.setNext(node);
		} else {
			head = node;
		}
		tail = node;
		size++;
	}
	
	public void deleteFirst() {
		if (head != null) {
			Node temp = head;
			head = temp.getNext();
			if (head.getNext() == null) {
				tail = null;
			}
		} else {
			return;
		}
		size--;
	}
	
	public void traverse(){
		Node temp = head;
		while(temp.getNext() != null){
			System.out.print(temp.getData() + " -->");
			temp = temp.getNext();
		}
		System.out.println(temp.getData());
	}
	
	public void reverse(){
		Node current = head;
		Node prev = null;
		Node next = null;
		
		while(current != null){
			if(prev == null){
				tail = current;
			}
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	public void addOne(){
		if(head == null){
			return;
		}
		reverse();
		Node temp = head;
		int result = 0;
		int carry = 1;
		while(temp != null){
			result = temp.getData() + carry;
			carry = result >=10 ? 1 : 0;
			result = result % 10;
			temp.setData(result);
			temp = temp.getNext();
		}
		if(carry > 0){
			Node next = new Node(carry);
			tail.setNext(next);
			tail = next;
		}
		reverse();
	}
	
	public void addOneRecursively(){
		Node temp = head;
		int carry = addOneToList(temp);
		if(carry > 0){
			Node node = new Node(carry);
			node.setNext(head);
			head = node;
		}
	}
	
	private int addOneToList(Node temp) {
		if(temp == null){
			return 1;
		}
		int result = temp.getData() + addOneToList(temp.getNext());
		temp.setData(result % 10);
		return (result /10);
	}

	public int decimalValue(){
		int result = 0;
		Node temp = head;
		while(temp != null){
//			result = (result * 2) + temp.getData();
			result = (result << 1) + temp.getData();
			temp = temp.getNext();
		}
		
		return result;
	}
}
