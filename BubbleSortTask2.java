package xyz;

public class BubbleSortTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,3,8,4,2};
		System.out.println("before sorting");
		for(int k=0;k< arr.length;k++) {
		System.out.print(arr[k]+" ");
		}
		for(int i=0;i< arr.length-1;i++) {
			for(int j=0;j< arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("\nafter sorting");
		for(int nums:arr) {
			
			System.out.print(nums+" ");
		}

	}

}
