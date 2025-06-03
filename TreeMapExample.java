package xyz;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> ts=new TreeMap<>();
		ts.put(1, "apple");
		ts.put(3, "banana");
		ts.put(4, "grapes");
		ts.put(6, "group");
		ts.put(2, "app");
		ts.put(5, "fig");
		
		System.out.println(ts);
		System.out.println(ts.isEmpty());
		System.out.println(ts.getOrDefault(7, "harshi"));
		ts.put(1, "mahi");
		System.out.println(ts);
		if(ts.containsKey(2)) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
		TreeMap<Long, String> phbook=new TreeMap<>();
        phbook.put(91002976100L, "honey");
        System.out.println(phbook);
	}

}
