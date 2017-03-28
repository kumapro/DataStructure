package com.learnjavabyexample.ds.searching.binary;

import java.util.Arrays;

public class TestBinarySearch {

	public static void main(String[] args) {
		// int[] arr = new int[7];
		Integer[] arr = new Integer[7];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 2;
		}
		// Arrays.asList(arr) for primitive array the result is [[I@139a55]
		// Arrays.asList(arr) for object array the result is the element of
		// array
		System.out.println("the given elements are " + Arrays.asList(arr));
		System.out.println("searching iteratively");
		int key = 9;
		int search = BinarySearch.searchIteratively(arr, key);

		if (search >= 0) {
			System.out.println("given element " + key + " is found at index " + search);
		} else {
			System.out.println("given element " + key + " is not found");
		}

		System.out.println("searching recursively");
		int key1 = 10;
		int searchRec = BinarySearch.searchRecursively(arr, 0, arr.length -1, key1 );

		if (searchRec >= 0) {
			System.out.println("given element " + key1 + " is found at index " + searchRec);
		} else {
			System.out.println("given element " + key1 + " is not found");
		}

	}

}
