package xyz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class StudentHashSetDyanamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<>();
		hs.add("Apple");
		hs.add("Fig");
		hs.add("Fig");
		hs.add("Goat");
		hs.add("Car");
		hs.add("Eye");
		hs.add("Bye");
		System.out.println(hs);
		String s="Appe";
		if(hs.contains(s)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		ArrayList<String> al=new ArrayList<>(hs);
		System.out.println(al);
		
	}

}
