import java.util.Random;

public class Day3IntroToConditionalStatements {

	public int randomIntegerBetween1And100() {
		Random rand  = new Random();
		//Generate a random number between 0-99
		int randomInteger = rand.nextInt(19);
		// In order to generate a random number between 1 and 100, we need to add 1		
		randomInteger++;
		return randomInteger;
	}
	
	public String checkIntWeirdOrNot(int rand) {
		System.out.println("The number is: " + rand);
		
		if (rand%2 != 0) {
				return "Weird";	
		} else if(rand%2 == 0 && 2<=rand && rand<=5) {
			return "Not Weird";
		} else if (rand%2 == 0 && 6<=rand && rand<=20) {
			return "Weird";
		} else if (rand%2 == 0 && rand >20){
			return "Not Weird";
		}	
		return null;
	}
	
	
	public Day3IntroToConditionalStatements() {
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day3IntroToConditionalStatements weirdOrNot = new Day3IntroToConditionalStatements();
		int x = weirdOrNot.randomIntegerBetween1And100();
		System.out.println(weirdOrNot.checkIntWeirdOrNot(x));
	}
}
