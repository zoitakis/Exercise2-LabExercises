package gr.upatras.Exercise1;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyClassTest {
	@Test
	void test1Minus() {
		MinusClass tester = new MinusClass();
		assertEquals("POSITIVE", tester.minus(5, 10), "5 - 10 must be NEGATIVE");
		/*Test pou anamenoume na apotyxei afou to apotelesma prepei na einai "NEGATIVE"*/
	}
	@Test
	void test2Minus() {
		MinusClass tester = new MinusClass();
		assertEquals("POSITIVE", tester.minus(10, 5), "10 - 5 must be POSITIVE");
	}
}