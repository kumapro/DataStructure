package com.learnjavabyexample.ds.searching.linear;

public class LinearSearch<T> {

	public static <T> int search(T[] arr, T key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
}
