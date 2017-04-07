package com.learnjavabyexample.ds.sorting.quick;

public class Client {

	public static void main(String[] args) {
		
		int arr[] = {10, 7, 8, 9, 1, 5, 2};
		System.out.println("Given Array");
        printArray(arr);
        int n = arr.length;
 
        QuickSort ob = new QuickSort();
//        ob.sort(arr, 0, n-1); // recursive call
        ob.sortIteratively(arr, 0, n-1);
 
        System.out.println("sorted array");
        printArray(arr);
		
	}

	private static void printArray(int[] arr) {
		for (int i=0; i< arr.length ; ++i){
			System.out.print(arr[i] + " ");
		}
        System.out.println();
	}
}
