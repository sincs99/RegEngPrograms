package examples;

public class Prim {

	// Prime Number Check, see http://www.java-uni.de/index.php?Seite=83

	static boolean isPrim(int p) {
		boolean isPrime = true;
		if (p < 2)
			return false;

		for (int i = 2; i <= Math.sqrt(p); i++) {
			if (p % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}