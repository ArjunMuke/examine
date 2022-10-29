package examples;

public class WhileLoop {
public static void main(String[]agrs) {
	int num = 123;
	int remainder,revnum=0;
	while(num > 0) {
		remainder=num%10;
		num = num / 10;
		revnum =(revnum*10) + remainder;
	}
	System.out.println(revnum);
}
}
