package com.learnjavabyexample.core.custom;

public class BinaryTree {

	private Node root;

	public class Node {
		private Integer data;
		private Node left;
		private Node right;

		public Node(Integer data) {
			super();
			this.data = data;
		}

		public Integer getData() {
			return data;
		}

		public void setData(Integer data) {
			this.data = data;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
		}

	}
	
	public void insert(Integer data){
//		insertItr(data);
		root = insertRec(root, data);
	}

	public void insertItr(Integer data){
		if(root == null){
			root = new Node(data);
			return;
		}
		Node temp = root;
		Node prev  = null;
		while(temp != null){
			prev = temp;
			if(data < temp.getData()){
				temp = temp.getLeft();
			}else if(data > temp.getData()){
				temp = temp.getRight();
			}
		}
		Node newNode = new Node(data);
		if(data > prev.getData()){
			prev.setRight(newNode);
		} else if(data < prev.getData()){
			prev.setLeft(newNode);
		}  
	}
	
	private Node insertRec(Node node, Integer data) {
		 if(node == null){
			 node = new Node(data);
			 return node;
		 }
		 if(data < node.getData()){
			 node.setLeft(insertRec(node.getLeft(), data));
		 }else if(data > node.getData()){
			 node.setRight(insertRec(node.getRight(), data));
		 }
		return node;
	}

	public void preOrderTraversal(){
		preOrderRec(root);
	}

	private void preOrderRec(Node node) {
		if(node == null){
			return;
		}
		Node temp = node;
		System.out.println(temp.getData());
		preOrderRec(temp.getLeft());
		preOrderRec(temp.getRight());
	}
	
	public void inOrderTraversal(){
		inOrderRec(root);
	}

	private void inOrderRec(Node node) {
		if(node == null){
			return;
		}
		Node temp = node;
		inOrderRec(temp.getLeft());
		System.out.println(temp.getData());
		inOrderRec(temp.getRight());
	}
	
	public void postOrderTraversal(){
		postOrderRec(root);
	}

	private void postOrderRec(Node node) {
		if(node == null){
			return;
		}
		Node temp = node;
		postOrderRec(temp.getLeft());
		postOrderRec(temp.getRight());
		System.out.println(temp.getData());
	}
}
