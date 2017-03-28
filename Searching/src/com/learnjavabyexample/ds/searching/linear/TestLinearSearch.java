package com.learnjavabyexample.ds.searching.linear;

import java.util.Arrays;

public class TestLinearSearch {

	public static void main(String[] args) {
		Integer[] arr = new Integer[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 2;
		}
		System.out.println("the given elements are " + Arrays.asList(arr));
		Integer key = 5;
		int searchIndex = LinearSearch.search(arr, 2);
		if (searchIndex >= 0) {
			System.out.println(key + " found at index " + searchIndex);
		} else {
			System.out.println(key + " not found in the given array");
		}
	}

}
