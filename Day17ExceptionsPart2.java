import java.util.*;
import java.io.*;

//Write your code here
class Calculator {
	// Properties
	
	// Constructors
	Calculator() { 		// Default constructor		
	}
	
	// Methods
	int power(int n, int p) throws Exception  {
		if (n>=0 && p>=0) {
		int intPowerCalculation = (int) Math.pow(n, p);
		return intPowerCalculation;
		}
		else {
			throw new Exception("n and p should be non-negative");
		}
	}
	
}


public class Day17ExceptionsPart2{
	// Properties
	
	// Constructors
	
	// Methods

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of test cases: ");
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
