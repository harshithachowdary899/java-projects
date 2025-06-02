package xyz;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class ArrayListDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> student=new ArrayList<>();
		student.add("apple");
		student.add("banana");
		student.add("grapes");
		student.add("strawberry");
		student.add("mulberry");
		Collections.sort(student);
	
		for(int i=0;i<student.size();i++) {
			System.out.println(student.get(i));
		}
			Collections.reverse(student);
	        for (int i = 0; i < student.size(); i++) {
	            System.out.println(student.get(i));
	        }
			
		
	}

}
