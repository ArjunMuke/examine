package collections;

import java.util.ArrayList;

public class StringArrayList {
	public static void main(String[] agrs) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Cricket");
		al.add("Run");
		al.add("Rasam");
		al.add("Guitar");
		al.add("Headset");
		//System.out.println(al.size());
		//for (int i = 0; i < al.size(); i++) {

			//System.out.println(al.get(i));
		//}
		   for (String string : al) {
			System.out.println(string);
		}
	}
}