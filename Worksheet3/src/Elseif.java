
/*Code by Louis Iglesias
 * input a month number and 
 * get the corresponding month
 */

import java.util.Scanner;

public class Elseif {

	public static void main(String[] args) {
		int count = 0;

		while (count < 4) { //while loop constantly checks after it runs through
			
			System.out.println("Enter a number of a month 1-12: ");
			Scanner sc = new Scanner(System.in);
	
			int month = sc.nextInt();
			
			if (month == 1) // using ifelseif statements to call upon the correct statement
				System.out.println("The month is january");
			else if (month == 2)
				System.out.println("The month is Febuary");
			else if (month == 3)
				System.out.println("The month is March");
			else if (month == 4)
				System.out.println("The month is April");
			else if (month == 5)
				System.out.println("The month is May");
			else if (month == 6)
				System.out.println("The month is June");
			else if (month == 7)
				System.out.println("The month is July");
			else if (month == 8)
				System.out.println("The month is August");
			else if (month == 9)
				System.out.println("The month is September");
			else if (month == 10)
				System.out.println("The month is October");
			else if (month == 11)
				System.out.println("The month is November");
			else if (month == 12)
				System.out.println("The month is December");
			else {
				System.out.println("You have entered an invalid month");
				count++; //storage of number of tries
				if (count == 4) { //on fourth attempt it exits
					System.out.println("The number of attempts has exceeded the limit.");
				}
			}


		}
	}
}
