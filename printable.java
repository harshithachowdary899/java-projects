package xyz;

public interface printable {
	void print();
}
class Message implements printable{
	public void print() {
		System.out.println("the interface");
	}
 public class abc{
	 public static void main(String[] args) {
		 Message obj=new Message();
		 obj.print();
	 }
 }
}
