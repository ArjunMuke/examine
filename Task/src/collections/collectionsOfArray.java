package collections;

import java.util.ArrayList;
import java.util.Iterator;
public class collectionsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Integer> al = new ArrayList<Integer>();
al.add(11);
al.add(22);
al.add(33);
al.add(22);
al.add(44);
al.add(55);
al.remove(2);
//System.out.println("array size:" + al.size());
	//System.out.println("array size:" + al.get(i));
	for (Integer integer : al) {
		
		System.out.println(integer);
	}
}

}
