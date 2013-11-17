package test;

/**
 * This class is to take over the world with your car collection
 */
public class SecondClass {

	private int numCars;
	
	public SecondClass(int n){
		numCars = n;
	}
	
	public SecondClass(){
		new SecondClass(0);
	}
	
	public int getNumCars(){
		return numCars;
	}
	
	public void setNumCars(int n){
		numCars = n;
	}
	
	public void buyCar(){
		numCars++;
		System.out.println("Congrats on your new car!  Now you have " + numCars + " cars!!");
	}
	
	public void sellCar(){
		numCars--;
		System.out.println("No silly you want all the cars, but now you only have " + numCars + " cars...");
	}
	
	@Override
	public String toString(){
		return ("You have " + numCars + " cars!");
	}
	
	@Override
	public boolean equals(Object a){
		if (this == a)
			return true;
		if(a == null)
			return false;
		if(getClass() != a.getClass())
			return false;
		SecondClass b = (SecondClass) a;
		if (this.numCars != b.numCars)
			return false;
		
		return true;
	}

}
