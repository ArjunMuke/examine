package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetInter {
	public static void main(String[] agrs) {
		LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>();
		ls.add(34);
		ls.add(76);
		ls.add(80);
		ls.add(1);
		System.out.println(ls.size());
		for (Integer integer : ls) {
			System.out.println(integer);
		}
	}
}
