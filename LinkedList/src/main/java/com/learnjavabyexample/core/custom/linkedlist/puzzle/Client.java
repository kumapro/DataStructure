package com.learnjavabyexample.core.custom.linkedlist.puzzle;

public class Client {

	public static void main(String[] args) {
//		testAddOne();
		testAddOneRecursively();
//		testDecimalValue();
	}

	private static void testDecimalValue() {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(0);
		list.add(0);
		list.add(1);
		list.add(1);
		list.add(0);
		
		list.traverse();
		int decimalValue = list.decimalValue();
		System.out.println("decimal value " + decimalValue);
	}
	
	private static void testAddOne() {
		LinkedList list = new LinkedList();
		list.add(9);
		list.add(9);
		list.add(9);
		list.add(9);
		list.add(9);
		list.traverse();
//		list.reverse();
		list.addOne();
		list.traverse();
	}
	
	
	private static void testAddOneRecursively() {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(9);
		list.add(9);
		list.add(8);
		list.add(9);
		list.traverse();
//		list.reverse();
		list.addOneRecursively();
		list.traverse();
	}

}
