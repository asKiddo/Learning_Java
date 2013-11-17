
package test;

public class FirstClass {
	
	private String name = "Hello";
	private int number = 5;
	
	public FirstClass() {
		System.out.println("Stuff happening");
	}
	
	public static int addition(int a, int b){
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass n = new FirstClass();
		System.out.println(n.name + " " + n.number);
		System.out.println("3 + 4 = " + addition(3,4));
		
		SecondClass b = new SecondClass(5);
		SecondClass c = new SecondClass(5);
		SecondClass d = new SecondClass();
		System.out.println(b);
		b.buyCar();
		b.sellCar();
		if(!b.equals(c)){
			if(b.getNumCars() > c.getNumCars())
				System.out.println("b is winning");
			else
				System.out.println("c is winning");
		} else {
			System.out.println("It's a tie!");
		}
		d.buyCar();
		
		ThirdClass e = new ThirdClass(7);
		e.buyCar();
		e.sellCar();
		
	}

}
