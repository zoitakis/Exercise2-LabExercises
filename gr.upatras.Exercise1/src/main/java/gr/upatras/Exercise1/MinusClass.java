package gr.upatras.Exercise1;

public class MinusClass {
	public String minus(int firstNumber, int secondNumber) {
		String result;
		if(firstNumber-secondNumber>0) {
			result = "POSITIVE";
		}
		else {
			result = "NEGATIVE";
		}
			return result ;
	}
}
