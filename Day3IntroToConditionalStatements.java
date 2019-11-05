import java.util.Random;

public class Day3IntroToConditionalStatements {

	public int randomIntegerBetween1And100() {
		Random rand  = new Random();
		//Generate a random number between 0-99
		int randomInteger = rand.nextInt(99);
		// In order to generate a random number between 1 and 100, we need to add 1		
		randomInteger++;
		return randomInteger;
	}
	
	public String checkIntWeirdOrNot(int n) {
		 if(n%2==0){
	         if(n>=2 && n<=5)
	             return "Not Weird";
	          else if(n>=6 && n<=20)
	        	  return "Weird";
	           else
	        	   return "Not Weird";
	              
	      }
	      else{
	        return "Weird";
	      }
	}
	
	public Day3IntroToConditionalStatements() {
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day3IntroToConditionalStatements weirdOrNot = new Day3IntroToConditionalStatements();
		int x = weirdOrNot.randomIntegerBetween1And100();
		System.out.print(weirdOrNot.checkIntWeirdOrNot(x));
	}
}	
