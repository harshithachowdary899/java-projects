package xyz;

import java.util.Scanner;

public class ReverseWordStringTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=new StringBuffer(s).reverse().toString();
		System.out.println(s1);

	}

}
