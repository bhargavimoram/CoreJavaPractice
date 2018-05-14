
public class IncrementTest {

	public static void main(String[] args) {
		// pre-increemnt
		int i = 1;
		int p = ++i;
		System.out.println("i:" + i + " p:" + p);// i = 2 and p = 2

		// post-increment
		int j = 1;
		int q = j++;
		System.out.println("j:" + j + " q:" + q);// j = 2 and q =1

	}

}
