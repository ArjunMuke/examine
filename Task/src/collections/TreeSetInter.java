package collections;

import java.util.TreeSet;

public class TreeSetInter {
public static void main(String[]agrs) {
	TreeSet<Integer>  ts = new TreeSet<Integer>();
	ts.add(111);
	ts.add(222);
	ts.add(888);
	ts.add(99);
	ts.add(88);
	System.out.println(ts.size());
	for (Integer integer : ts) {
		System.out.println(integer);
	}
}
}
