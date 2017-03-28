package com.learnjavabyexample.ds.sorting.client;

import com.learnjavabyexample.ds.sorting.bubble.BubbleSort;
import com.learnjavabyexample.ds.sorting.insertion.InsertionSort;
import com.learnjavabyexample.ds.sorting.selection.SelectionSort;

public class TestSortingTechniques {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = arr.length, j = 0; i > 0 ; i--, j++) {
			arr[j] = i;
		}
		/*printArray(arr);
		bubbleSort(arr);
		System.out.println();
		printArray(arr);*/
		
		/*printArray(arr);
		selectionSort(arr);
		System.out.println();
		printArray(arr);*/
		
		printArray(arr);
		insertionSort(arr);
		System.out.println();
		printArray(arr);
		
		

	}

	private static void insertionSort(int[] arr) {
		InsertionSort sort = new InsertionSort();
		sort.sort(arr);
		
	}

	private static void selectionSort(int[] arr) {
		SelectionSort sort = new SelectionSort();
		sort.sort(arr);
		
	}

	private static void bubbleSort(int[] arr) {
		 BubbleSort sort = new BubbleSort();
		 sort.sort(arr);
	}
	
	private static void printArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", " );
		}
	}

}
