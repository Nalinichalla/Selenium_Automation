package coreJava;

public class StringValidation {
	public static void main(String[] args) {

		String abc = "Nalini";
		String bcd = "nalini is from hyderabad/USA";
		
		if (5>8) {
			System.out.println("if block executed ");
		} else {
			System.out.println("else block executed");
		}
		

		if (abc.equals(bcd)) {
			System.out.println("**********Both the strings are matching");

		} else {
			System.out.println("**********Both the strings are not matching");
		}
		
		
		if (abc.equalsIgnoreCase(bcd)) {
			System.out.println("#############Both the strings are matching");

		} else {
			System.out.println("##################Both the strings are not matching");
		}
		
		
		
		
		if (bcd.contains("nalini")) {
			System.out.println("String contains nalaini text");
			
		} else {
			System.out.println("String not contains nalaini text");
		}
		
		
	}

}
