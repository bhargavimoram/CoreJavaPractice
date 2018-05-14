
public class ForLoopTest {

	public static void main(String[] args) {
		if (args.length > 0) {
			int a = Integer.parseInt(args[0]);

			for (int x = 1; x <= 10; x++) {

				System.out.println(a + " * " + x + " = " + (a * x));
			}
			for (int x = 10; x >= 1; x--) {

				System.out.println(a + " * " + x + " = " + (a * x));
			}
		} else {
			System.out.println("No values to print!! ");
		}

	}
}
