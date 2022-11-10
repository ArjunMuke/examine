package examples;

public class ReverseTheString {

	public static void main(String[] args) {
		String name = "abcd";
		
		String reverseString = name;
		for (int acb = name.length() - 1; acb >= 0; acb--) {
			System.out.print(reverseString.charAt(acb));
		}

	}

}
