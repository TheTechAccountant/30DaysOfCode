import java.io.*;
import java.util.*;

public class Day6LetsReview {

	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
       	Scanner in = new Scanner(System.in);
    	String myString = "";
    	String evenString = "";
    	String oddString = "";
    	int t;
    	
    	// Prompt user to enter number of test cases they want to run
    	System.out.print("Please enter the number of test cases you want to run: ");
    	t = in.nextInt();
    	
    	// Run a loop for test cases
    	for(int i=0; i<t;i++) {
    		System.out.println("Please enter the String you want to evaluate: ");
    		myString = in.next();
    		System.out.println("String inputted: " + myString);
    		
    		// Convert to component characters
    		char[] myCharArray = myString.toCharArray();
    		
    		// Run loop to split test case string into even 
    		for (int j=0; j<myString.length(); j++) {
    			if (j%2 == 0) {
    	    	System.out.print(myCharArray[j]);
    			} 
    		}
    		System.out.print(" ");
    		
    		// Run loop to split test case string into odd 
    		for (int j=0; j<myString.length(); j++) {
    			if (j%2 != 0) {
    	    	System.out.print(myCharArray[j]);
    			} 
    		}
    		
    		System.out.println("");
    		
    	}
    	in.close();
    }
}

