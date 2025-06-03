package xyz;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TreeSet<Integer> numbers=new TreeSet<>();
       numbers.add(50);
       numbers.add(100);
       numbers.add(30);
       System.out.println(numbers);
       numbers.add(10);
       System.out.println(numbers);
      if( numbers.contains(50)) {
    	  System.out.println("yes");
      }else {
    	  System.out.println("no");
      }
       System.out.println(numbers);
       System.out.println(numbers.first());
       System.out.println(numbers.higher(50));
       System.out.println(numbers.ceiling(100));
	}

}
