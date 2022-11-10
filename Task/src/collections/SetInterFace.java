package collections;

import java.util.HashSet;

public class SetInterFace {
public static void main(String[]agrs) {
	HashSet <Integer> as = new HashSet<Integer>();
	as.add(99);
	as.add(88);
	as.add(44);
	as.add(99);
	as.add(66);
	as.add(55);
	as.add(44);
	//System.out.println(as.size());
	for (Integer integer : as) {
		System.out.println(integer);
	}
}
}
