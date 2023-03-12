package Automation;

public class FirstjavaProgram {

	// double sladh is used to comment line

	int a = 5;// class variable or global variable

	static int c = 10;// static variable
	// shortcut to write main method - type ma inside class body and type
	// ctrl+space

	public static void main(String[] args) {

		// shortcut to write system.out.println:- write syso inside method body and
		// press ctrl+space

		System.out.println("Hello Selenium");// Printing the string parameter
		System.out.println("Yogesh");
		System.out.println("Gulab");
		System.out.println("Andre");
		aMethod();
		bMethod();
	}

	// user defined static method
	public static void aMethod() {
		System.out.println("Hello a Method");
	}

	// user defined static mathod
	public static void bMethod() {
		System.out.println("Hello b Method");

		//int b = 4;// Local Variable
	}

}
