package com.learnjavabyexample.ds.searching.binary;

public class BinarySearch {

	public static int searchIteratively(Integer[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (key > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static int searchRecursively(Integer[] arr, int left, int right, int key) {

		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == key) {
				return mid;
			}else if (key > arr[mid] ) {
				return searchRecursively(arr, mid + 1, right, key);
			} else {
				return searchRecursively(arr, left, mid - 1, key);
			}
		}
		return -1;
	}
}
