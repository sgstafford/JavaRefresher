
public class Car {
	
	private CarBody body = new CarBody();
	
	
	
	public CarBody getCarBody(){
		System.out.println("the body of the car is " + body.getColor());
		return body;
	}
	

}
