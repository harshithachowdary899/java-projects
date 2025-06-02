package xyz;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> student=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<=n;i++) {
		String name=s.nextLine();
		student.add(name);
		}
		student.remove(1);
         System.out.println(student);
         s.close();
	}
   
}
