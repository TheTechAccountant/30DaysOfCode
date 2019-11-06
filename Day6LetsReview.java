import java.io.*;
import java.util.*;

public class Day6LetsReview {

	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
       	Scanner in = new Scanner(System.in);
    	
    	String s = "";
    	String evenString = "";
    	String oddString = "";
    	int t;
    	
    	// Prompt user to enter number of test cases they want to run
    	System.out.print("Please enter the number of test cases you want to run: ");
    	t = in.nextInt();
    	
    	// Run a loop for test cases
    	for(int i=0; i<t;i++) {
    		System.out.println("Please enter the String you want to evaluate: ");
    		s = in.next();
    		s.toCharArray();
    		// System.out.println(s);
    		System.out.print(s);
    		
    		
    		
    		// Run loop to split test case string into even and odd
    		for (int j=0; j<s.length(); j++) {
    			char currentCharacter = s.charAt(j);
    			
    			if (j%2==0) {
    				evenString= "" + currentCharacter;
    			} else {
    				oddString = "" + currentCharacter;
    			}
    	    	System.out.print(evenString);
    	    	
    		}
    	}
    	


 
    	s = "s";
    	s = s + "t";
    	System.out.print(s);
  
    }
}

