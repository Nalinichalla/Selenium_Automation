package coreJava;

import java.security.PublicKey;

public class Addition {
//	group of statements are called method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		add();
//		addnew(20, 30);
//		addnew(100, 500);
//		addnew(500, 800);
	}

	public static void add() {
		int a = 19;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		int a1 = 10;
		int b2 = 30;
		int c3 = a1 + b2;
		System.out.println(c3);

	}

	public static void addnew(int a, int b) {
		int c = a + b;
		System.out.println(c);

	}
}
