package examples;

public class ForLoop {
	public static void main(String[] agrs) {
	
		int remainder = 0;

		for (int num=123; num != 0; num /= 10) {
			int digit = num % 10;
			remainder = remainder * 10 + digit;

		}
		System.out.println(remainder);
	}
}