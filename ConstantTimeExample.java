package xyz;

public class ConstantTimeExample {

    // Method that demonstrates O(1) time complexity
    public static void printFirstElement(int[] arr) {
        if (arr.length > 0) {
            System.out.println("First element is: " + arr[0]);
        } else {
            System.out.println("Array is empty.");
        }
    }

    public static void main(String[] args) {
        // Example array
        int[] numbers = {10, 20, 30, 40, 50};

        // Calling the O(1) method
        printFirstElement(numbers);
    }
}