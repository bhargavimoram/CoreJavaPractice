
public class AssignmentOperatorTest {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(" i: " + i);// 10
		i += 10; // i = i + 10;
		System.out.println(" i+= 10: " + i);// 20
		i -= 10; // i = i - 10;
		System.out.println(" i-= 10: " + i);// 10
		i *= 10; // i = i * 10;
		System.out.println(" i*= 10: " + i);// 100
		i /= 10;
		System.out.println(" i/= 10: " + i);// 10
		i %= 10;
		System.out.println(" i%= 10: " + i);// 0
	}

}
