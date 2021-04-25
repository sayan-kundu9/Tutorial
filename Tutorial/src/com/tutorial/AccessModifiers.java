package com.tutorial;

public class AccessModifiers {
	
	public int i1 = 1;    // everywhere
	private int i2 = 2;   // only in scope of class
	int i3 = 3;			  // only in scope of package
	protected int i4 = 4; // scope of package and child classes
	
	public int copyOfi2 = i2;
}
