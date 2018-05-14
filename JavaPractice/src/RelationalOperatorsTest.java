
public class RelationalOperatorsTest {

	public static void main(String[] args) {
		int i = 37;
		int j = 42;
		int k = 42;

		System.out.println("Greater than...");
		System.out.println(" i > j = " + (i > j));// false
		System.out.println(" j > i = " + (j > i));// true
		System.out.println(" k > j = " + (k > j));// false

		System.out.println("Greater than or equal to... ");
		System.out.println(" i >= j = " + (i >= j));// false
		System.out.println(" j >= i = " + (j >= i));// true
		System.out.println(" k >= j = " + (k >= j));// true

		System.out.println("less than...");
		System.out.println(" i < j = " + (i < j));// true
		System.out.println(" j < i = " + (j < i));// false
		System.out.println(" k < j = " + (k < j));// false

		System.out.println("less than or equal to... ");
		System.out.println(" i <= j = " + (i <= j));// true
		System.out.println(" j <= i = " + (j <= i));// false
		System.out.println(" k <= j = " + (k <= j));// true

		System.out.println("Equal to...");
		System.out.println("i == j =" + (i == j));// false
		System.out.println("k == j =" + (k == j));// true

		System.out.println(" Not equal to...");
		System.out.println("i != j =" + (i != j));   // true
		System.out.println("k != j =" + (k != j));    // false

	}

}
