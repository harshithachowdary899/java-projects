package xyz;

import java.util.Stack;

public class StackTaskExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<String> plate =new Stack<>();
        plate.push("plate 1");
        plate.push("plate 2");
        plate.push("plate 3");
        plate.push("plate 4");
        plate.push("plate 5");
        System.out.println(plate.peek());
        System.out.println(plate.pop());
        System.out.println(plate.size());
        plate.push("plate 6" );
        System.out.println(plate.clone());
          System.out.println(plate.getFirst());
          System.out.println(plate.size());
	}

}
