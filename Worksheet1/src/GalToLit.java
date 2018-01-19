
public class GalToLit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double gallons;
double liters;
double gasoline;
double gallonsCost;

gallons = 10;
liters = gallons * 3.7854;
gasoline = 2.49;
gallonsCost = gallons * gasoline;


System.out.println(gallons + " gallons is " + liters + " liters.");
System.out.println("The cost of " + gallons + " gallons is $" + gallonsCost);
//why the hell is it giving me the .00000000000002 stuff?
	}

}
