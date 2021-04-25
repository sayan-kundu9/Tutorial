package com.tutorial;

public class MainClass {
	
	public static void main(String args[]) {
		//System.out.println("Hello");
		//primitiveDatatypes();
		//concatinate("str", 6, 4);
		
		String totalReturn =  returnTypes(6, 4);
		System.out.println(totalReturn);
	}
	
	public static String returnTypes (int i, int k) {
		int total = i + k;
		String s = "five";
		return s;
	}
	
	
	public static void concatinate(String s, int i, int k) {
		System.out.println(i + k);
		System.out.println(s + i + k);
		System.out.println(i + k + s + i);
		System.out.println(i + s + k);
	}
	
	private static void operators() {
		//Arithmetic operators :  +, -, *, /, %
		// Conditional : >, <, !=, ==
		// Assignment operator : =
		// Increment, decrement  : ++, -- 
		// Logical : &&, ||, ^
		// Bitwise operator: &, |
		
	}
	
	public static void primitiveDatatypes() {
		
// premitive datatype
//		String s; // class and datatype both
//		byte b;		// 1 byte
//		short so;	//2 byte
//		int i;		//4byte
//		long l;		//8 byte
//		float f;		//4 byte
//		double d;		// 8  byte
//		char c;		// 2 byte
//		boolean bool;	//1 bit
		int i = 6;
		
		System.out.println("Hello fro custom method");
		System.out.println("initialized i :  " + i);
		
	}

}
