package abhi.java8.lamda;

public class CalculatorTest01 {

	public static void main(String[] args) {
		
		/*
		
		// Defining LamdaExpression with Multiple Statements ==> Performing Arithmetic Operations
		Calculator calculator = (value1, value2) -> {
			int sum = 0;
			int subtract = 0;
			if (value1 < value2) {
				sum = value1 + value2;
				System.out.println("value1 < value2, Hence sum : " + sum);
			} else if (value1 > value2) {
				subtract = value1 - value2;
				System.out.println("value1 > value2, Hence subtraction : " + subtract);
			}
			return 0;
		};
		
		// Calling LamdaExpression 
		calculator.calculation(10, 20);
		calculator.calculation(100, 20);
		int result = calculator.calculation(100, 100);
		System.out.println("If both Values are same, No Operation: "+ result);
		
		 */
		
		
		// Defining LamdaExpression with Multiple Statements ==> Performing Arithmetic
		// Operations
		Calculator01 calculator1 = (value1, value2) -> {

			if (value1 < value2) {
				return value2;
			} else if (value1 > value2) {
				return value1;
			}
			return 0;
		};

		// Calling LamdaExpression
		System.out.println(calculator1.calculation(10, 20));
		System.out.println(calculator1.calculation(10, 200));
		
		int result = calculator1.calculation(100, 100);
		System.out.println("If both Values are same, No Operation: " + result);

		// Defining LamdaExpression with Single Statements ==> Just Returning values
		Calculator01 calculator2 = (value1, value2) -> (value1 < value2) ? value2 : value1;

		int biggestVauleOfTwo = calculator2.calculation(10, 30);
		System.out.println("Biggest Vaule Of Two : " + biggestVauleOfTwo);

	}
}














