package abhi.java8.lamda;

public class CalculatorTest02 {

	public static void main(String[] args) {

		// Defining LamdaExpression with Single Statements ==> Just Returning values
		Calculator02 calculator2 = () -> "Hello Abhilash....!";
//		System.out.println(calculator2.greatng()); 

		String greatng = calculator2.greatng();
		System.out.println(greatng);
	}
}














