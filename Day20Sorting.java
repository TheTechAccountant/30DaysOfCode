import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day20Sorting {
	
	public static void addInputElementsToArray(int[] a, int n, Scanner console) {
        // Adding elements to the array
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = console.nextInt();
        }
        System.out.println("Elements have been added the the array");
	}
	   

    public static void main(String[] args) {
    	// Properties
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter array size: ");
        int n = in.nextInt();
        int[] a = new int[n];
        int arrayLength = a.length-1;
        int numSwaps = 0;
        
        // Methods
        addInputElementsToArray(a, n, in);
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);
        
       for (int i=0; i<n; i++) {
    	   
    	   for(int j = 0; j<arrayLength; j++) {
			   if(a[j]>a[j+1]) {
				   int tmp = a[j];
				   a[j] = a[j+1];
				   a[j+1] = tmp;
				   numSwaps ++;
			   }
    	   }
       }
       System.out.println("Array is sorted in " + numSwaps + " swaps.");
       System.out.println("First Element: " + a[0]);
       System.out.println("Last Element: " + a[arrayLength]);
       }  
 
}

