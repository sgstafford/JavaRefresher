
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Car car = new Car();
		String color = car.getCarBody().getColor();
		System.out.println("I got the " + color + " car");
		

	}

}
