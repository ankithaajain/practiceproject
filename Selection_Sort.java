package com.jain.ankitha;

import java.util.Arrays;

public class Selection_Sort {
    public static void selectionsort(int[] arr) {
    	int size = arr.length;
    	
    	for(int i = 0; i < size-1; i++) {
    		int min = i;
    		for(int j = i+1; j < size; j++) {
    			if(arr[j] < arr[min]) {
    				min = j;
    			}
    		}
    		int temp = arr[i];
    		arr[i] = arr[min];
    		arr[min] = temp;
    	}
    }
    
    public static void main(String [] args) {
    	int[] arr = {16, 3, 7, 14, 28, 33};
    	Selection_Sort ss = new Selection_Sort();
    	ss.selectionsort(arr);
    	System.out.println("Sorted Array is : ");
    	System.out.println(Arrays.toString(arr));
    }
}