/**
 * 
 */
package com.learnjavabyexample.core.custom.linkedlist;

/**
 * @author pmis23
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		testBasicFunctionOnLinkedList();
//		retainMNodeThenDeleteMNodeTest();
		testCircularity();
//		testCycle();
	}
	
	private static void testCycle() {
		LinkedList<String> list = new LinkedList<>();
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");
		list.add("fifth");
		list.traverse();
		list.add("six");
		list.add("seven");
		list.add("eight");
		list.add("nine");
		list.add("ten");
		list.formCycle();
		System.out.println("\nCycle is detected in Given list: " + list.detectCycle());
		
		list.removeCycle();
		System.out.println("\nCheck if list has still cycle: " + list.detectCycle());
		list.traverse();
		
	}
	
	private static void testCircularity(){
		LinkedList<String> list = new LinkedList<>();
		list.addCircularly("first");
		list.addCircularly("second");
		list.addCircularly("third");
		list.addCircularly("fourth");
		list.addCircularly("fifth");
		list.addCircularly("six");
		list.addCircularly("seven");
		list.addCircularly("eight");
		list.addCircularly("nine");
		list.addCircularly("ten");
		
		System.out.println("Given list is circular: " + list.isCircular());
		list.removeCircularity();
		list.traverse();
		System.out.println("\nlenght of the list is " + list.findLingth());
		
		boolean search = list.search("nine");
		System.out.println("nine is present in the list: " + search);
		
		/*LinkedList<String> list1 = new LinkedList<>();
		list1.add("first");
		list1.add("second");
		list1.add("third");
		list1.add("fourth");
		list1.add("fifth");
		list1.add("six");
		list1.add("seven");
		list1.add("eight");
		list1.add("nine");
		list1.add("ten");
		
		System.out.println("Given list is circular: " + list1.isCircular());*/
	}
	
	
	private static void retainMNodeThenDeleteMNodeTest(){
		LinkedList<String> list = new LinkedList<>();
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");
		list.add("fifth");
		list.add("six");
		list.add("seven");
		list.add("eight");
		list.add("nine");
		list.add("ten");
		list.traverse();
		System.out.println();
		System.out.println(list.isCircular());
//		LinkedList<String> linkedList = list.retainMDeleteN(2, 1);
//		linkedList.traverse();
		list.retainMDeleteN(1, 2);
		list.traverse();
	}
	
	
	
	

	private static void testBasicFunctionOnLinkedList() {
		LinkedList<String> list = new LinkedList<>();
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");
		list.add("fifth");
//		list.addAtHead("ten");
//		list.addAfterGivenElement("eleven", "fifth");
		
		System.out.println("Before reverse method called");
		list.traverse();
		
		list.reverse();
		
		System.out.println("\nAfter reverse method called");
		list.traverse();
		
		System.out.println("\nafter reversal add six at last and traverse the list");
		
		list.add("six");
		list.traverse();
		
		
		
		/*System.out.println("\nnumber of element in list is: " + list.size());
		System.out.println("printing list once ready....");
		list.traverse();*/
		
		/*list.deleteFirst();
		System.out.println("\nnumber of element in list after deleting from head: " + list.size());
		System.out.println("after delete \n");
		list.traverse();*/
		
		/*list.deleteLast();
		System.out.println("\nnumber of element in list after deleting last element: " + list.size());
		System.out.println("after delete from tail\n");
		list.traverse();*/
		
		/*list.deleteWithGiveData("second");
		System.out.println("\nnumber of element in list after deleting second: " + list.size());
		System.out.println("\ndeleteAfter second \n");
		list.traverse();*/
	}

}
