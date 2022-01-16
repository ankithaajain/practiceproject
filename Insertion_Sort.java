package com.jain.ankitha;

import java.util.Arrays;

public class Insertion_Sort {
	public static void insertionsort(int[] arr) {
		int size = arr.length;
		
		for(int i = 1; i <= size-1; i++) {
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	public static void main(String [] args) {
		int[] arr = {4, 6, 17, 26, 11, 68};
		Insertion_Sort is = new Insertion_Sort();
		is.insertionsort(arr);
		System.out.println("Sorted array is : ");
		System.out.println(Arrays.toString(arr));
	}
}