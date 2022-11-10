package examples;

public class Planets {
public static  void main(String agrs[]) {
	String man = "moon sun\" jupiter is a largest plannet\" pluto saturan ";
	String temp="";
	String array[]=new String[5];
	int  arrayIndex = 0;
	int doublequotescounter = 0;
	for(int i=0; i<man.length(); i++) {
		if(man.charAt(i) == '"') {
			temp = temp + man.charAt(i);
			doublequotescounter++;
		}else if (doublequotescounter % 2 ==0 && man.charAt(i) == ' ') {
			array[arrayIndex++] = temp;
			temp = "";
		}else {
			temp = temp + man.charAt(i);
		}
	}
	array[arrayIndex] = temp;
	for(int i=0; i< array.length; i++) {
		System.out.println(array[i]);
	}
}
}
