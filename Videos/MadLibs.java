import java.util.*;


public class MadLibs {
	
	Scanner scanner = new Scanner(System.in);
	Random rand = new Random();
	
	String story;
	String name;
	String adjective1;
	String adjective2;
	String noun1;
	String noun2;
	String noun3;
	String adverb;
	String randomNums;

	
	// Getters
	public String getStory() {
		return story;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAdjective1() {
		return adjective1;
	}
	
	public String getAdjective2() {
		return adjective2;
	}
	
	public String getNoun1() {
		return noun1;
	}
	
	public String getNoun2() {
		return noun2;
	}
	
	public String getNoun3() {
		return noun3;
	}

	public String getAdverb() {
		return adverb;
	}
	
	public String getRandomNums() {
		return randomNums;
	}
	
	// Setters
	public void setString(String newStory) {
		this.story = newStory;
	}

	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setAdjective1(String newAdjective1) {
		this.adjective1 = newAdjective1;
	}
	
	public void setAdjective2(String newAdjective2) {
		this.adjective2 = newAdjective2;
	}
	
	public void setNoun1(String newNoun1) {
		this.noun1 = newNoun1;
	}
	
	public void setNoun2(String newNoun2) {
		this.noun2 = newNoun2;
	}
	
	public void setNoun3(String newNoun3) {
		this.noun3 = newNoun3;
	}
	
	public void setAdverb (String newAdverb) {
		this.adverb = newAdverb;
	}
	
	public void setRandomNums() {
		
	}
		
	public void printInstructions() {
		System.out.println("Welcome to the MadLibs game. If you type in words, "
				+ "We will give you a story. Start by typing in a name.");
	}
	
	public void enterName() {
		setName(scanner.nextLine());
	}
	
	public void enterNoun1() {
	
	}
	
	public void putTogetherTheStory() {
		String story = "Jesse and her best friend " + getName() + " went to Disney World Today!"
				+ "The saw a " + getNoun1() + " in a show at the Magic Kingdom"
				+ "and ate a " + getAdjective1() + " feast for dinner. The next "
				+ "day I ran " + getAdverb() + " to meet Mickey Mouse"
				+ " in his " + getNoun2() + " and then that night "
				+ "I gazed at the " + getRandomNums() + " "
				+ getAdjective2() + "fireworks shooting from the " 
				+ getNoun3() + ".";
		setStory(story);
	}
		
	public static void main(String[] args) {
		
		MadLibs game = new MadLibs();
		game.printInstructions();
		
		
	}
}
