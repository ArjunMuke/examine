package examples;

public class Factorial {
public static void main(String[]agrs) {
	int x=10;
	int result=1;
	for(int i=x; i>1; i--) {
		result=result*i;
	}
	System.out.println("Factorial of " + x + " is " + result);
}
}
