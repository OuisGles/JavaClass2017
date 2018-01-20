//Code by Louis Iglesias
//converts a given celsius or fahrenheit into the other.
import java.util.Scanner;
public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double fair, cel, temperature;
		cel = 0; //set one of these to convert
		fair = 1000;
		
		Scanner in = new Scanner(System.in);
		temperature = in.nextDouble();
		
		
		if(cel > 0) {
			fair = ( 1.8 * cel + 32);
			System.out.println("The temperature in fahrenheit is " + fair);
	
		}
		
		else if(fair > 0) {	
			cel = (.55556) * (fair - 32);
			System.out.println("The temperature in celsius is " + cel);

		}
		
		
	}

}
