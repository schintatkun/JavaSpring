
public class CalculatorTester {
	public static void main(String[] args) {
		Calculator test1 = new Calculator();
		test1.setOperandOne(10);
		test1.setOperandTwo(2.5);
		test1.setOperation("+");
		test1.performOperation();
		test1.getResults();
		
		Calculator test2 = new Calculator();
		//this will get error
		//test2.setOperation("2");
		
		Calculator test3 = new Calculator();
		test3.setOperandOne(100);
		test3.setOperandTwo(39);
		test3.setOperation("-");
		test3.performOperation();
		test3.getResults();
	}
}
