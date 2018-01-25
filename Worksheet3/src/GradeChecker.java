/* Code by Louis Iglesias
 * Average calculator of 5 given inputs
 * 
 */

import java.util.Scanner;
public class GradeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade;
		int count = 0;
		int gradesum = 0;
		int sent = 0;
		int holder = 0;

		
	

	do { //back checking code
		System.out.println("Johnny, what grades did you get on your exams");
		Scanner input = new Scanner(System.in); //calling for an input from the user.
		
		holder = input.nextInt(); //used a holder as to not mess up the running average
		sent = holder;
		if (sent != -1) {
		gradesum = gradesum + holder;
		count++;
		gradesum = gradesum/count; //the average calculation
		
			if (gradesum >= 90)
				System.out.println("Good job Johnny! you got an average of " +gradesum + "%"); //using nested if statements
			else if(gradesum >= 80)
				System.out.println("Still good Johnny! you got an average of " +gradesum + "%");
			else if(gradesum >= 70)
				System.out.println("Johnny! I know you can do better! you got an average of " +gradesum + "%");
			else if(gradesum >= 60)
				System.out.println("Come on Johnny! you barely passed with an average of " +gradesum + "%");
			else if(gradesum < 60)
				System.out.println("I am very dissapointed that you got an average of " +gradesum + "%");
			else {
				System.out.println("You have chosen to exit. Your average for " + count + "tests is " +gradesum + "%");
			}
		}
	}while(sent != -1);
			
			
	
		}
		
			
	}



	
	
	


