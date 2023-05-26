package gr.upatras.Exercise1;
import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
		MinusClass m = new MinusClass();
		System.out.println("Give me the first Number:");
		Scanner inFirst = new Scanner(System.in);
		String firstNumber = inFirst.next();
		System.out.println("Give me the second Number:");
		Scanner inSecond = new Scanner(System.in);
		String secondNumber = inSecond.next();
		String result = m.minus(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber));
		System.out.println(result);
		inFirst.close();
		inSecond.close();
	}

}
