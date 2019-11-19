import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day16Exceptions {
	
	// Properties
	
	// Constructors
	
	// Methods
	public static void printInteger(String S) {
		try { 
			System.out.println(Integer.parseInt(S));
		} catch (NumberFormatException e) {
			System.out.println("Bad String");
		}
	}
	
	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String S = in.next();
	        printInteger(S);
	        in.close();
	    }

}
