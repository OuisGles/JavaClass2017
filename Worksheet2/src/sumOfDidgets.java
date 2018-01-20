//Code by Louis Iglesias
/* I created a program that adds the sum of a four digit integer. The way I got this program to work was by taking 
advantage of the fact that, "int" doesn't store any decimal places.
 */

public class sumOfDidgets {

	public static void main(String[] args) {
		
		int digit, d1, d2, d3, d4, dsum; //declaring all of our variables
		
		digit = 9288;
		d1 = digit / 1000; // this gets the thousands place.
		d2 = digit % 1000 / 100; // if / 1000 the remainder is B, you then / 100 and you get the hundreds place
		d3 = digit % 1000 / 10 % 10; // the remainder of this operation is the last 3 digits... /10 = hundreds and 10s,
		//remainder of this gets the 10s place.
		d4 = digit % 10; //the remainder of digit / 10 = ones place.
		dsum = d1 + d2 + d3 + d4;
		
		System.out.println("The sum of the digits for number: " + digit
				+ " is " + d1 + " + " + d2 + " + " + d3 + " + " + d4 + " = " + dsum);
		
	}
}
