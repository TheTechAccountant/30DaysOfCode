import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Day18QueuesAndStacks {

	// Properties
    private LinkedList stack;
    private LinkedList queue;
	
	// Constructors
    public Day18QueuesAndStacks() {
    	this.stack = new LinkedList();
    	this.queue = new LinkedList();
    }
    
	
	// Methods
    
	private char popCharacter() {
		return (char) this.stack.pop();
	}
	
	private void pushCharacter(char character) {
		this.stack.push(character);
	}
	
	
	private char dequeueCharacter() {
		return (char) queue.remove(0);
	}
	

	private void enqueueCharacter(char character) {
		this.queue.addLast(character);
	}
	

	
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word or phrase: ");
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18QueuesAndStacks p = new Day18QueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
