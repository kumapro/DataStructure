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
	}
	
	public void add(T data){
		Node<T> node = new Node<>(data);
//		System.out.println("adding " + node);
		if(head !=  null){
			tail.setNext(node);
		}else{
			head = node;
		}
		tail = node;
		size++;
	}
	
	public void addAtHead(T data){
		Node<T> node = new Node<>(data);
//		System.out.println("adding " + node);
		if(head ==  null){
			head = node;
		}else{
			node.setNext(head);
			head = node;
		}
		size++;
	}
	
	public void addAfterGivenElement(T data, T after){
		if(head == null){
			return;
		}
		Node<T> node = new Node<>(data);
		Node<T> temp = head;
		while(temp != null){
			if(temp.getData().equals(after)){
				node.setNext(temp.getNext());
				temp.setNext(node);
				size++;
				break;
			}
			temp = temp.getNext();
		}
		if((temp != null) && (temp.getNext() == null)){
			tail = node;
		}
	}
	
	public void traverse(){
		Node<T> temp = head;
		while(temp != null){
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
	
	public void deleteFirst(){
		if(head != null){
			Node<T> temp = head;
			head = temp.getNext();
			if(head.getNext() == null){
				tail = null;
			}
		}else{
			return;
		}
		size--;
	}
	
	public void deleteLast(){
		Node<T> temp = head;
		while(temp.getNext().getNext() != null){
			temp = temp.getNext();
		}
		tail = temp;
		temp.setNext(null);
		size--;
	}
	
	public void deleteWithGiveData(T data){
		if(head == null){
			return;
		}
		Node<T> temp = head;
		Node<T> prev = null;
		while(temp != null){
			if(temp.getData().equals(data)){
				size--;
				break;
			}
			prev = temp;
			temp = temp.getNext();
		}
		if(prev != null){
			prev.setNext(temp.getNext());
		}else{
			head = temp.getNext();
		}
		if(temp.getNext() == null){
			tail = temp;
		}
	}

	public int size(){
		return size;
	}
}
