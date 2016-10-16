import java.util.Scanner;

/**
 * this class gets an integer input from the user and prints ascending and descending... 
 * ...staircases of 'x' characters. The program is restricted to only use a single literal
 * which is either the char 'x' or the String "x".
 * @author Ethan Chung
 * @version 1.0
 */

public class StairCases
{
	/**
	* Main method demonstrates the other wo methods by calling each of them.
	* @param args Standard array of commandline String arguments. Not used in this program.
	*/
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to represent the length of the staircases");
		int size = scan.nextInt();
		
		printAscending(size);
		printDescending(size);
	}

	/**
	* prints out the ascending part of the staircase and then a new line to separate...
	* ...the ascending staircase from the descending staircase
	* @param size  the user's entered length
	*/
	public static void printAscending(int size)
	{
		int counter = 0;
		for (int x = 0; x < size; x++)
		{	
			counter ++;
			for (int y = 0; y < counter; y++)
			{
				System.out.print("x ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
 
	/**
	* prints out the descending part of the staircase
	* @param size  the user's entered length 
	*/
	public static void printDescending(int size)
	{
		int counter = size + 1;
		for (int x = 0; x < size; x++)
		{	
			counter --;	
			for (int y = 0; y < counter; y++)
			{
				System.out.print("x ");
			}
			System.out.print("\n");
		}
	}
}
