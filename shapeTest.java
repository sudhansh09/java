package practical;
import java.util.*;

abstract class shape{
	abstract double compute_area();
}

class Rectangle extends shape{
	Scanner sc=new Scanner(System.in);
	double width;
	double length;
	double area;
	
	double compute_area() {
		System.out.println("Enter width: ");
		width=sc.nextDouble();
		System.out.println("Enter length: ");
		length=sc.nextDouble();
		return area=width*length;
	}
	
	void displayinfo() {
		System.out.println("Area of reactangle: "+area);
	}
}
class Triangle extends shape{
	Scanner sc=new Scanner(System.in);
	double base;
	double height;
	double area;
	
	double compute_area() {
		System.out.println("Enter base: ");
		base=sc.nextDouble();
		System.out.println("Enter height: ");
		height=sc.nextDouble();
		return area=0.5*base*height;
	}
	void display() {
		System.out.println("Area of triangle: "+area);
	}
}
public class shapeTest {
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		r.compute_area();
		t.compute_area();
		r.displayinfo();
		t.display();
	}
}
