package Arrays;

public class Simple_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Limiting Array to 5 indices
		String[] std = new String[5];
		
		std[1] = "Ashif"; // Array starts with 0th position. Which means 1 is the second position.
		
		System.out.println(std[0]); // First Index: Null
		System.out.println(std[1]); // Second Index: Ashif
		
		// Another way of inputing Array
		String[] employees = {"Ashif", "Joshim", "Mahin", "Ashraf"};
		int[] numbers = {1, 2, 3, 4};
		
		// Here we know the array length
		System.out.print("\nEmployees: ");
		for (int i = 0; i < 4; i++) {
			System.out.print(employees[i]);
			if (i < 4 - 1) {
		        System.out.print(", ");
			}
		}
		
		// What if we don't know the array length. Use array.length;
		System.out.print("\nNumbers: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			if (i < numbers.length - 1) {
		        System.out.print(", ");
			}
		}
	}

}
