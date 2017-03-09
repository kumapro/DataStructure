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
		LinkedList<String> list = new LinkedList<>();
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");
		list.add("fifth");
		list.addAtHead("ten");
		list.addAfterGivenElement("eleven", "fifth");
		System.out.println("\nnumber of element in list is: " + list.size());
		System.out.println("printing list once ready....");
		list.traverse();
		
		list.deleteFirst();
		System.out.println("\nnumber of element in list after deleting from head: " + list.size());
		System.out.println("after delete \n");
		list.traverse();
		
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
