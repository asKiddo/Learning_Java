package test;

/**
 * This class is designed to sell off all the cars you have accumulated
 */
public class ThirdClass extends SecondClass{

	public ThirdClass(){
		super();
	}
	
	public ThirdClass(int n){
		super(n);
	}
	
	@Override
	public void buyCar(){
		this.setNumCars(this.getNumCars()+1);
		System.out.println("No silly now we are trying to make cash off our cars!  Now you have " + this.getNumCars() + " cars.");
	}
	
	@Override
	public void sellCar(){
		this.setNumCars(this.getNumCars()-1);
		System.out.println("Yay you made money and now you only have " + this.getNumCars() + " cars!!!");
	}
}
