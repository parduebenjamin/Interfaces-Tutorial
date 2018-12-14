
public class InterfaceTutorial {

	public static void main(String[] args) {
		
		Vehicle car = new Vehicle(4,100.00);
		System.out.println("Car's Max Speed " + car.getSpeed());
		System.out.println("Number of Wheels " + car.getWheels());
		
		car.setCarStrength(10);
		System.out.println(car.getCarStrength());
		

	}

}
