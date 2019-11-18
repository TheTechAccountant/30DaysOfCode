import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	Difference(int[] integerArray) {
  		this.elements = integerArray;
  	}
  
  	public void computeDifference() {
  		for(int i=0; i< elements.length ; i++) {
  			// System.out.print(elements[i]);
  			for(int j=0; j< elements.length ; j++) 
  			{
  				int z = (int) Math.abs(elements[i] - elements[j]); 
  				if (z > maximumDifference) {
  					maximumDifference = z;
  				}
  			}
  			
  		}
  	}
} // End of Difference class

public class Day14Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the Array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
