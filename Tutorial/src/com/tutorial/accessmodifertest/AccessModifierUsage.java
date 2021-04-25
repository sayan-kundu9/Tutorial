package com.tutorial.accessmodifertest;

import com.tutorial.AccessModifiers;

public class AccessModifierUsage extends AccessModifiers{
	// child class of AccessModifiers
	
	public static void main(String[] args) {
		
		AccessModifiers a = new AccessModifiers();
		System.out.println(a.i1); // public visible
		//System.out.println(a.i3); // default not visible outside package
		printProtected();
		
		
	}
	
	public static void printProtected() {
		AccessModifierUsage accessModifierUsage = new AccessModifierUsage(new AccessModifiers());
		System.out.println(accessModifierUsage.i4);
		
	}
	
	public AccessModifierUsage(AccessModifiers accessModifiers) {
		System.out.println(this.i4);
	}

}
