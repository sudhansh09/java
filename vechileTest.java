package practical;

interface vehicle{
	void gearChange(int gear);
	void speedUp(int increment);
	void applyBreak(int decrement);
}

class Bicycle implements vehicle{
	int gear;
	int speed;
	public Bicycle() {
		speed=0;
		gear=1;
	}
	public void gearChange(int gear) {
		this.gear=gear;
		System.out.println("Bicycle gear change to: "+gear);
	}
	public void speedUp(int increament) {
		speed+=increament;
		System.out.println("Bicycle speed increase to: "+speed+" Km/hr");
	}
	public void applyBreak(int decrement) {
		speed-=decrement;
		System.out.println("Bicycle speed decrease to: "+speed+" Km/hr");
	}
}
class Bike implements vehicle{
	int gear;
	int speed;
	public void gearChange(int gear) {
		this.gear=gear;
		System.out.println("Bike gear change to: "+gear);
	}
	public void speedUp(int increament) {
		speed+=increament;
		System.out.println("Bike speed increase to: "+speed+" Km/hr");
	}
	public void applyBreak(int decreament) {
		speed-=decreament;
		System.out.println("Bike speed decrease to: "+speed+" Km/hr");
	}
}
class Car implements vehicle{
	int gear;
	int speed;
	public void gearChange(int gear) {
		this.gear=gear;
		System.out.println("Car gear change to: "+gear);
	}
	public void speedUp(int increament) {
		speed+=increament;
		System.out.println("Car speed increase to: "+speed+" Km/hr");
	}
	public void applyBreak(int decrement) {
		speed-=decrement;
		System.out.println("Car speed decrease to: "+speed+" Km/hr");
	}
}
public class vehicleTest {
	public static void main(String[] args) {
		Bicycle bicycle=new Bicycle();
		bicycle.gearChange(2);
		bicycle.speedUp(20);
		bicycle.applyBreak(10);
		System.out.println();
		
		Bike bike=new Bike();
		bike.gearChange(3);
		bike.speedUp(50);
		bike.applyBreak(20);
		System.out.println();
		
		Car car=new Car();
		car.gearChange(4);
		car.speedUp(70);
		car.applyBreak(20);
	}

}
