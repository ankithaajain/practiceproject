package com.jain.ankitha;

//method demo
public class CallbyValue {
	int val = 50;
	int operation(int val) {
		val = val * 10 / 100;
		return(val);
	}
	
	public static void main(String [] args) {
		CallbyValue a = new CallbyValue();
		System.out.println("Before operation value of data " + a.val);
		a.operation(100);
		System.out.println("After operation value of data " + a.val);
	}
}

