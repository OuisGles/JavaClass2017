/* Code by Louis Iglesias
 * Switch method to display 
 * the month given an input 1-12
 */

import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of a month 1-12: ");
		int month=sc.nextInt();

		switch(month) //using a switch to match the input with a case.
		{
		case 1:
			System.out.println("The month is january"); //break statements end the cases.
			break;
		case 2:
			System.out.println("The month is Febuary");
			break;
		case 3:
			System.out.println("The month is March");
			break;
		case 4:
			System.out.println("The month is April");
			break;
		case 5:
			System.out.println("The month is May");
			break;
		case 6:
			System.out.println("The month is June");
			break;
		case 7:
			System.out.println("The month is July");
			break;
		case 8:
			System.out.println("The month is August");
			break;
		case 9:
			System.out.println("The month is September");
			break;
		case 10:
			System.out.println("The month is October");
			break;
		case 11:
			System.out.println("The month is November");
			break;
		case 12:
			System.out.println("The month is December");
			break;
		default: //this is like the else statement
			System.out.println("You have entered an invalid month");
			break;
		}
	}
		
	}
