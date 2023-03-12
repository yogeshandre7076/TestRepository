package Automation;

public class Variable1 {

	public static void main(String[] args) {

		int a = 5;// int type local variable
		System.out.println(a);// 5

		int x = 100;// int type local variable
		System.out.println(x);// 100

		x = 200;
		System.out.println(x);

		char c = 'a';// char type local variable, should be placed inside single quote
		System.out.println(c);// a

		boolean b = true;
		b = false;
		System.out.println(b);

		System.out.println(3 > 12);// false

		int e = 100;// int type local variable
		int f = 200;// int type local variable

		boolean z = e > f;
		System.out.println(z);// false

	}

}
