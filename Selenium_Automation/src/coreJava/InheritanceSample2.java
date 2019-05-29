package coreJava;

public class InheritanceSample2 extends InheritanceSample1 {
	// we didn't created any test1() method in this class (child class)
	// system will go to parent class and get the test1() method

	public static void main(String[] args) {
		test1();
		test2();
	}

}
