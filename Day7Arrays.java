import java.util.*;

public class Day7Arrays {
		
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter Array size: ");
		// Variable of type integer to determine no. Array Elements
		// Declaration of Array 
		int _arraySize = scanner.nextInt(); 
		int[] intArray = new int[_arraySize]; 
		
		
		String[] arrItems = scanner.nextLine().split(" ");
		
		System.out.print(arrItems);
		
		
	}
}
