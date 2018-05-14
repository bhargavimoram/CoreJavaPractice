
public class EnhancedForTest {

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50 };

		// using regular for loop
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			System.out.println("\t");
		}
		System.out.println("\n");

		// using enhanced for loop
		for (int x : numbers) {
			System.out.println(x);
			System.out.println("\t");
		}
		System.out.println("\n");
		String[] names = { " bhargavi", "Loki", "tanuja", "padma" };
		for (String name : names) {
			System.out.println(name);
			System.out.println("\t");
		}
		System.out.println("\n");
	}

}
