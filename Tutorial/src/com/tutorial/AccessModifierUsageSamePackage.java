package com.tutorial;

public class AccessModifierUsageSamePackage {
	
	public static void main(String[] args) {
		AccessModifiers a = new AccessModifiers();
		System.out.println(a.i1); // public visible 
		//System.out.println(a.i2); //private can't be visible 
		System.out.println(a.i3);
	}

}
