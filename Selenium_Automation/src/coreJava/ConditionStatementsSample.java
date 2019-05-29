package coreJava;

public class ConditionStatementsSample {
//	a) if statement
//	b) nested if statement
//	c) if-else statement
//	d) if-else-if statement
	public static void main(String[] args) {
		//Age
		//0-2 yrs infant
		//2-5 yrs toddler
		//5-12 yrs child
		//12-18 yrs youth
		//18-59 yrs adults
		//59-100 yrs Sr citizen
		int age = 40;
		String gender = "Female";
		
		if (age>0 && age<=2) {
			System.out.println("entered Age comes under Infant");
			
		} else if(age>2 && age <=5){
			System.out.println("entered Age comes under toddler");
		}
		else if(age>5 && age <=12){
			System.out.println("entered Age comes under child");
		}
		else if(age>12 && age <=18){
			System.out.println("entered Age comes under youth");
		}
		else if(age>18 && age <=59){
			System.out.println("entered Age comes under adults");
		}
		else if(age>59 && age <=100){
			System.out.println("entered Age comes under Sr.citizen");
		}
		else {
			System.out.println("Please enter valid age format....");
		}
		
		//Nested If condition
		//Gender = Female
		//Age 50 years
		if (gender.equals("Female")) {
			System.out.println("If statement has executed");
			
			if (age==50) {
				System.out.println("Nested If statement has executed");
			}
		}
	}

}
