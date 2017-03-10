package com.learnjavabyexample.core.custom.linkedlist;

public class LinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size;

	static class Node<T> {
		T data;
		Node<T> next;

		public Node() {

		}

		public Node(T data) {
			this.data = data;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return this.data.toString();
		}
	}

	public void add(T data) {
		Node<T> node = new Node<>(data);
		if (head != null) {
			tail.setNext(node);
		} else {
			head = node;
		}
		tail = node;
		size++;
	}

	public void addAtHead(T data) {
		Node<T> node = new Node<>(data);
		if (head == null) {
			head = node;
		} else {
			node.setNext(head);
			head = node;
		}
		size++;
	}

	public void addAfterGivenElement(T data, T after) {
		if (head == null) {
			return;
		}
		Node<T> node = new Node<>(data);
		Node<T> temp = head;
		while (temp != null) {
			if (temp.getData().equals(after)) {
				node.setNext(temp.getNext());
				temp.setNext(node);
				size++;
				break;
			}
			temp = temp.getNext();
		}
		if ((temp != null) && (temp.getNext() == null)) {
			tail = node;
		}
	}

	public void traverse() {
		Node<T> temp = head;
		while (temp != null) {
			if (temp.getNext() != null) {
				System.out.print(temp.getData() + "-->");
			} else {
				System.out.print(temp.getData());
			}

			temp = temp.getNext();
		}
	}
	
	public boolean search(T data) {
		Node<T> temp = head;
		while (temp != null) {
			if (temp.getData().equals(data)) {
				return true;
			} 
			temp = temp.getNext();
		}
		return false;
	}
	
	public int findLingth(){
		if(this.head == null){
			return 0;
		}
		int count = 0;
		Node<T> temp = this.head;
		while(temp != null){
			count++;
			temp = temp.getNext();
		}
		return count;
	}

	public void deleteFirst() {
		if (head != null) {
			Node<T> temp = head;
			head = temp.getNext();
			if (head.getNext() == null) {
				tail = null;
			}
		} else {
			return;
		}
		size--;
	}

	public void deleteLast() {
		Node<T> temp = head;
		while (temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		tail = temp;
		temp.setNext(null);
		size--;
	}

	public void deleteWithGiveData(T data) {
		if (head == null) {
			return;
		}
		Node<T> temp = head;
		Node<T> prev = null;
		while (temp != null) {
			if (temp.getData().equals(data)) {
				size--;
				break;
			}
			prev = temp;
			temp = temp.getNext();
		}
		if (prev != null) {
			prev.setNext(temp.getNext());
		} else {
			head = temp.getNext();
		}
		if (temp.getNext() == null) {
			tail = temp;
		}
	}

	public void reverse() {
		Node<T> prev = null;
		Node<T> current = this.head;
		Node<T> next = null;
		while (current != null) {
			if (prev == null) {
				tail = current;
			}
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public void retainMDeleteN(int m, int n) {
		Node<T> current = this.head;
		Node<T> temp = null;

		while (current != null) {
			for (int count = 1; count < m && current != null; count++) {
				current = current.getNext();
			}
			if (current != null) {
				temp = current.getNext();
			} else {
				break;
			}

			for (int count = 1; count <= n && temp != null; count++) {
				deleteWithGiveData(temp.getData());
				temp = temp.getNext();
			}
			current.setNext(temp);
			current = temp;
		}
		
	}

	public boolean isCircular(){
		Node<T> temp = this.head.getNext();
		if(head == null){
			return true;
		}
		while ((temp != null) && (temp != head)) {
			temp = temp.getNext();
		}
		return (temp == head);
	}
	
	public void addCircularly(T data){
		Node<T> node = new Node<>(data);
		node.setNext(head);
		if (head != null) {
			tail.setNext(node);
		} else {
			head = node;
		}
		tail = node;
		size++;
	}
	
	public void removeCircularity(){
		if(head == null){
			return;
		}
		Node<T> first = head;
		Node<T> second = head;
		Node<T> prev = head;
		
		while((first != null) && (second != null) && (second.getNext() != null)){
			prev = first;
			first = first.getNext();
			second = second.getNext().getNext();
			if(first.equals(second)){
				break;
			}
		}
		prev.setNext(null);
	}
	
	public void formCycle(){
		tail.setNext(head.getNext());
	}
	
	// Floyd’s Cycle finding algorithm.
	public boolean detectCycle(){
		if(head == null){
			return true;
		}
		Node<T> first = head;
		Node<T> second = head;
		
		while((first != null) && (second != null) && (second.getNext() != null)){
			first = first.getNext();
			second = second.getNext().getNext();
			if(first.equals(second)){
				return true;
			}
		}
		return false;
	}
	
	public void removeCycle(){
		if(head == null){
			return;
		}
		Node<T> first = head;
		Node<T> second = head;
		
		while((first != null) && (second != null) && (second.getNext() != null)){
			first = first.getNext();
			second = second.getNext().getNext();
			if(first.equals(second)){
				break;
			}
		}
		first.setNext(null);
	}
	
	public int size() {
		return size;
	}
}
