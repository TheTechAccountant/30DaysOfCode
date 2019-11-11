import java.util.*;

public class Day7Arrays {
	
	public static void printArray(int[] array) {
		// System.out.print("[");
		for(int i = array.length-1; i>=0;i--) {
			int item = array[i];
			System.out.print(item + " ");
		}
		System.out.println();		
	}
	
	// Below method is not required, but would be used to create an array of random integers
	public static void obtainArrayDetails(int[] array) {
		Random rand = new Random();
		for(int i = 0; i<array.length;i++) {
			int randomNum = rand.nextInt();
			array[i] = randomNum;
			
		}
		System.out.println(Arrays.toString(array));		
	}
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter Array size: ");
		int _arraySize = scanner.nextInt(); // Variable of type 'integer' to determine no. Array Elements
		int[] intArray = new int[_arraySize]; // Declaration of Array 
			
		// Create array inputs using a Scanner
		for(int i = 0; i<intArray.length;i++) {
			int randomNum = scanner.nextInt();
			intArray[i] = randomNum;	
		}
		
		// Method to print array in Reverse
		printArray(intArray);


		
	}
}
