
public class TernaryTest {

	public static void main(String[] args) {
		int a = 10, b = 9, max = 0;
		/*
		 * if (a > b) { max = a; } else { max = b; }
		 */
		max = (a > b) ? a : b;
		System.out.println("Greatest of " + a + " and " + b + " is: " + max);

	}

}
