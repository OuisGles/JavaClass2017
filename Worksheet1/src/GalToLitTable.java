
public class GalToLitTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double gallons, liters, gasolineCost, gasolineCostTotal;
			int counter;
			
			counter = 0;
			gasolineCost = 2.49;
			for(gallons = 1; gallons <= 20; gallons++) {
				liters = gallons * 3.7854;
				gasolineCostTotal = gallons * gasolineCost;
				System.out.println(gallons + " gallons is " +
									liters + " liters and costs $" + gasolineCostTotal);
				
				counter++;
				if(counter == 10) {
					System.out.println();
					counter = 0;
					//why do some liters and gasolineCostTotal freak out?
				}
				
				
			}

	}

}
