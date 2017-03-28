package com.learnjavabyexample.ds.sorting.insertion;

public class InsertionSort {

	public void sort(int[] arr) {
		int i, key, j;
		for (i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

}
