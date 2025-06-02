package xyz;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li=new LinkedList<>();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			String name1=s.nextLine();
			li.add(name1);
		}
      System.out.println(li);
      s.close();
	}

}
