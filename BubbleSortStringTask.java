package xyz;

public class BubbleSortStringTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]= {"grapes","pineapple","apple","banana"};
          for(int i=0;i< name.length-1;i++) {
        	  for(int j=0;j< name.length-i-1;j++) {
        		  if(name[j].compareToIgnoreCase(name[j+1])>0){
        			 String temp=name[j];
        			 name[j]=name[j+1];
        			 name[j+1]=temp;
        		  }
        	  }
          }
          System.out.println("after sorting");
          for(String val:name) {
        	  System.out.println(val);
          }
		}

}
