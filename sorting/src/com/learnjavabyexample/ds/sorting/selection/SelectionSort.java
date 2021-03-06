package com.learnjavabyexample.ds.sorting.selection;

public class SelectionSort {

	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min_index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			if (arr[i] > arr[min_index]) {
				int temp = arr[i];
				arr[i] = arr[min_index];
				arr[min_index] = temp;
			}
		}
	}
}
