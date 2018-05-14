
public class WelcomeArgsTest {

	public static void main(String[] args) {
		System.out.println("Welcome to java programming language");
		if (args.length > 0) {
			System.out.println("Argument1:" + args[0]);
			System.out.println("Argument2:" + args[1]);
			System.out.println("Argument3:" + args[2]);
		} else {
			System.out.println("No args");
		}
	}

}
