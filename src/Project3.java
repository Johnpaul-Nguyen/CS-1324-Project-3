import java.util.Scanner;
public class Project3 {

	public static void main(String[] args) {
		//Add Scanner Class
		Scanner keyboard = new Scanner(System.in);
	
		
		//Prompt user to give inputs
		System.out.println("Enter the name of first type of yarn");
		//Assign inputs to variables
		String name = keyboard.nextLine();
		
		System.out.println("Enter the number of balls needed");
		int numBalls = keyboard.nextInt();
		keyboard.nextLine();
		

		System.out.println("Enter number of yards per ball of yarn");
		int lengthBalls = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.println("Enter the name of the substitute yarn");
		
		String nameSub = keyboard.nextLine();
		
		System.out.println("Enter the number of yards per ball");
		
		int lengthSubBalls = keyboard.nextInt();
		
		//Calculate
		//Find the total length of yarn
		int totalLength = numBalls * lengthBalls;
		//Find the number of substitute balls
		int numSubBalls = (int) Math.ceil((double) totalLength / lengthSubBalls);
		
		//Print the output
		
		System.out.println("You should purchase " + numSubBalls + " balls of" + " " + nameSub + " " +  "instead of " + numBalls + " balls " + "of" + " " + name + ".");
		
		
		
		
	
		
	}
}
