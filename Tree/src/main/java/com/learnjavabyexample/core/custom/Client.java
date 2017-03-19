package com.learnjavabyexample.core.custom;

public class Client {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.insert(10);
		tree.insert(20);
		tree.insert(7);
		tree.insert(5);
		tree.insert(2);
		
//		tree.preOrderTraversal();
		tree.inOrderTraversal();
//		tree.postOrderTraversal();

	}

}
