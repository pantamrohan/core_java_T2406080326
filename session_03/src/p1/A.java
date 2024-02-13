package p1;

public class A {
	 protected int a = 100;
	public  static int xy = 10;
	protected void getA() {    // its protected it can only be accesed in other package by inheritance
		//where as private can't be accesed by any one outside that class 
		System.out.println("a ="+ a);
	}

}

//default it can access in same package not in other package
//public it can be access by any one 
//private it can only accessed by same class not in same pkg/other pkg
//protected it can be access by same package class and for other package it need to access by inheritance(extends) 