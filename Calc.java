package xyz;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
        char choice=sc.next().charAt(0);
        double result=0;
        switch (choice) {
		case '+': {
			System.out.println("adding of two number");
			result=a+b;
			System.out.println(result);
			break;
		}
		case '-': {
			System.out.println("subtraction of two number");
			result=a-b;
			System.out.println(result);
			break;
		}
		case '*': {
			System.out.println("multiplication of two number");
			result=a*b;
			System.out.println(result);
			break;
		}
		case '/': {
			if(b==0) {
				System.out.println("not possible");
				break;
			}else {
			System.out.println("division of two number");
			result=a/b;
			System.out.println(result);
			break;
			}
		}
		case '%': {
			System.out.println("modulus of two number");
			result=a%b;
			System.out.println(result);
			break;
		}
		
		default:
			//throw new IllegalArgumentException("Unexpected value: " + choice);
			System.out.println("invalid ");
			break;
		}
        sc.close();
	}

}
