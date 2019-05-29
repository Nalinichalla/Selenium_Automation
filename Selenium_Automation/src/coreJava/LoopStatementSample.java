package coreJava;

public class LoopStatementSample {
	public static void main(String[] args) {
		//Pring 1 to 10 number & in that print only Even numbers
		//for(initialize;condition;increment){}
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
			//print only Even numbers in 1 to 10 range
			if ((i%2) == 0) {
				System.out.println("Even number: "+i);
			}else {
				System.out.println("Odd number: "+i);
			}
		}
	}
	
	//Nested for loop
	

}
