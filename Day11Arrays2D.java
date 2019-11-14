import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day11Arrays2D {



    private static final Scanner scanner = new Scanner(System.in);

    public static void largestValue() {
    	
    }
    
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int rowLength = arr.length;
        int colLength = arr[0].length;
 
        // Assign all inputs from the Scanner to a 6*6 Array.
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem; 
                }  
            }     
        int sum = 0;
        int max = 0;
        
        for (int i = 0; i < 6;i++) {
        	for(int j=0; j<6; j++) {
                if ((i>1 && i<5) && (j>1 && j<5)) {
                	int topOfHourGlass = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1];
                	int bottomOfHourGlass = arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
                	sum = arr[i][j] + topOfHourGlass + bottomOfHourGlass;
                	System.out.println(sum);
                	if (sum>max) {
                		max = sum;
                	}
                } 
        	}
        }
        System.out.print(max);
   
        
        scanner.close();
    }
}
