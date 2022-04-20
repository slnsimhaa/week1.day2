package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator obj1 = new Calculator();
		
		//Running the methods created in class **Calculator**
		
		int sum = obj1.addThreeNumbers(5, 4, 3);
		System.out.println(sum);
		
		int sub = obj1.subTwoNumbers(10, 5);
		System.out.println(sub);
		
		double mul = obj1.mulTwoNumbers(5, 4);
		System.out.println(mul);
		
		float div = obj1.divTwoNumbers(7, 2);
		System.out.println(div);
	}



}


