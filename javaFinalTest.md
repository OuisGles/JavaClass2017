# JavaClass2017
All Code from Intro to Java

class $Bicycle {
        
    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;
    public String brand;
    public String model;
    public String type;
    public String description;
    public String []issues;
    Boolean speedDifference;
    
    
        
    // the Bicycle class has one constructor
    public $Bicycle(int startCadence, int startGear, int startSpeed) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    
    public $Bicycle(String startBrand, String startModel, String startType) {
    	brand = startBrand;
    	model = startModel;
    	type = startType;
    	
    	
    }
        
    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
   
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
    
    public void setBrand(String brandName) {
    	brand = brandName;
    }
    
    public void setModel(String modelName) {
    	model = modelName;
    }
    
    public void setType(String typeName) {
    	type = typeName;
    }
    
    public void setSpeed(int speedS) {
    	speed = speedS;
    }
    
    public String getDescription() {
    	description = "Brand: " + brand + " Model: " + model + " Type: " + type + " Candence: "
    			+ cadence + " gear: " + gear + " speed: " + speed;
    	return description;
    }
    
    public void topIssues() {
    	String []issues = { "", "", "", "", ""};
    }
    
    public void addIssue(String addIssue) {
    	String []issues = {addIssue};
    }
    
    public void addIssue(String newIssue1, String newIssue2, String newIssue3, String newIssue4, String newIssue5) {
    	String []issues = {newIssue1,newIssue2,newIssue3,newIssue4,newIssue5};
    }
    
    public Boolean compareSpeed(int compareSpeeds) {
    	if (compareSpeeds > speed) {
    		speedDifference = true;
    	}
    	else 
    		speedDifference = false;
    	
    	return speedDifference;
    }    
    
}

public class Bicycle {
	public static void main(String[] args) {
		$Bicycle [] bike = {
				new $Bicycle(90, 18, 35),
				new $Bicycle(95, 18, 40),
				new $Bicycle("Specialized", "S-Works", ""),
				new $Bicycle("Trek", "7200", "Hybrid"),
				new $Bicycle("Trek", "800", "Mountain")		
		};
		bike[0].setBrand("Cannondale");
		bike[0].setModel("CAAD	10");
		bike[1].setBrand("Specialized");
		bike[1].setModel("S-Works");
		bike[2].setCadence(70);
		bike[2].setGear(12);
		bike[2].setSpeed(22);
		bike[3].setCadence(82);
		bike[3].setGear(12);
		bike[4].setCadence(65);
		bike[4].setGear(10);
		
		
		
		for(int i =0; i<5; i++) {
			System.out.println(bike[i].getDescription());
		}
		
		bike[0].addIssue("Flat Tire", "Slipping Gears", "Snapped Brake line", "Bent Wheel", "Broken Gear Tooth");
		bike[4].addIssue("Broken Chain");
		
		System.out.println("Is S-Works faster than Cannondale? " + bike[0].compareSpeed(40));
		
		
		
	}
}
