
public class MaxOfTwoNumbers {

	public static void main(String[] args) {
		// when our argument length is greater than 0.., 0th argument is converting into integer  and assigning the value into variable 'a' and then args[1] assigning into 'b'.
		if (args.length > 0) {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			if (a > b) {
				System.out.println(a + "is greater than" + b);
			} else {
				System.out.println(b + "is greater than" + a);
			}
		} else {
			System.out.println("No values to compare!!");
		}
	}
}
