package com.learnjavabyexample.ds.sorting.merge;

public class Client {

	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7, 1, 5};
		 
        System.out.println("Given Array");
        printArray(arr);
 
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);
 
        System.out.println("\nSorted array");
        printArray(arr);
	}

	private static void printArray(int[] arr) {
		for (int i=0; i< arr.length ; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
	}
}
