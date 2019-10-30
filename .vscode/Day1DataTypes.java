import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1DataTypes {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int inputInteger = 12;
        double inputDouble = 4.00;
        String inputString = "is the best place to learn and practice coding!";
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + inputInteger);
        /* Print the sum of the double variables on a new line. */
		System.out.println(d + inputDouble);
        /* Concatenate and print the String variables on a new line; 
            the 's' variable above should be printed first. */
        System.out.print(s + inputString);

        scan.close();
    }
}