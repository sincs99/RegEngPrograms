package examples;

public class MyEvenOddStatic {

	static boolean isEvenNumber(int number) {

		boolean result = false;
		if (number % 2 == 0) {
			result = true;
		}
		return result;
	}
}