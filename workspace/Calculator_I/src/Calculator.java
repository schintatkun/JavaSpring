
public class Calculator implements java.io.Serializable{
		private double operandOne;
		private double operandTwo;
		private String operation;
		private double result; 
		public Calculator() {
			
		}
//		public Calculator(double op1, double op2, String operation) {
//			this.operandOne = op1;
//			this.operandTwo = op2;
//			this.operation = operation;
//		}
		public double getOperandOne() {
			return this.operandOne;
		}
		
		public double getOperandTwo() {
			return this.operandTwo;
		}
		
		public String getOperation() {
			return this.operation;
		}
		
		public void setOperandOne(double operandOne) {
			this.operandOne = operandOne;
		}
		
		public void setOperandTwo(double operandTwo) {
			this.operandTwo = operandTwo;
		}
		
		public void setOperation(String operation) {
			if(operation == "+" || operation == "-") {
				this.operation = operation;
			}
			else {
				System.err.println("Invalid operation");
			}
		}
		
		public void performOperation() {
			if (getOperation() == "+") {
				System.out.println(this.operandOne+" "+this.operandTwo);
				this.result = getOperandOne()+getOperandTwo();
			}else if(getOperation() == "-") {
				this.result = getOperandOne()-getOperandTwo();
			}else {
				System.err.println("Invalid");
			}
		}
		public void getResults() {
			System.out.println("Result is : "+this.result);
		}
}