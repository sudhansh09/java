package practical;
import java.util.*;
abstract class Car_factory{
	String company,car_name;
	double budget;
	abstract void getprice(double price);
	abstract void details(String company_name,String car_name);
	abstract void accessories();
	
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Company: ");
		company=sc.nextLine();
		System.out.println("Car Name: ");
		car_name=sc.nextLine();
		System.out.println("Budget: ");
		budget=sc.nextDouble();
	}
	void display(Car_factory obj1) {
		obj1.getprice(budget);
		System.out.println("\n------------------------");
		obj1.details(company, car_name);
		System.out.println("\n-------------------------");
		obj1.accessories();
		System.out.println("\n--------------------------");
	}
}
class Smallcar extends Car_factory{
	String Ans;
	
	void getprice(double price) {
		if(price>2 && price<5)
			Ans="No";
		else
			Ans="Yes";
	}
	void details(String company,String car_name) {
		System.out.println("Company Name: "+company);
		System.out.println("Car Name: "+car_name);
		System.out.println("Color: Black/White/Orange/Red");
		System.out.println("Fuel: Petrol");
		System.out.println("Gear: Manual");
	}
	void accessories() {
		System.out.println("Type of Tyres: Alloy Wheels");
		System.out.println("Airbags: "+Ans);
		System.out.println("Back Wiper: "+Ans);
		System.out.println("Side Mirror: Two");
		System.out.println("Touch Screen Music Player: "+Ans);
	}
}
class Seden extends Car_factory{
	String Ans;
	
	void getprice(double price) {
		if(price>6 && price<10)
			Ans="No";
		else
			Ans="Yes";
	}
	void details(String company,String car_name) {
		System.out.println("Company: "+company);
		System.out.println("Car Name: "+car_name);
		System.out.println("Color: Black/White/Orange/Red");
		System.out.println("Fuel: Petrol/Diesel");
		System.out.println("Gear: Auto/Manual");
	}
	void accessories() {
		System.out.println("Type of Tyers: Alloy Wheels");
		System.out.println("Airbags: Yes");
		System.out.println("Back Wiper: Yes");
		System.out.println("Side Mirror: Yes");
		System.out.println("Touch Screen Music Player: Yes");
		System.out.println("Roof Window: "+Ans);
	}
}
class Luxary extends Car_factory{
	String Ans;
	
	void getprice(double price) {
		if(price>10 && price<14)
			Ans="No";
		else
			Ans="Yes";
	}
	void details(String company,String car_name) {
		System.out.println("Company: "+company);
		System.out.println("Car Name: "+car_name);
		System.out.println("color: Black/White/Red/Orange");
		System.out.println("Fuel: Diesel");
		System.out.println("Gear: Auto");
	}
	void accessories() {
		System.out.println("Type of Tyers: Alloy Wheels");
		System.out.println("Airbags: Yes");
		System.out.println("Back Wiper: Yes");
		System.out.println("Side Mirror: Two");
		System.out.println("Touch Screen Music Player: Yes");
		System.out.println("Roof Window: Yes");
		System.out.println("Automotive Garbage Cans: "+Ans);
		System.out.println("Automotive Air Freshner: "+Ans);
		System.out.println("Button Start: "+Ans);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		Car_factory obj;
		do {
			System.out.println("Which Car you want to see: ");
			System.out.println("\n\t1.Small Car\n\t2.Seden Car\n\t3.Luxary Car\n\t4.Exit.");
			System.out.println("Enter your choice: ");
			ch=sc.nextInt();
			System.out.println();
			switch(ch) {
			case 1: obj =new Smallcar();
			obj.input();
			obj.display(obj);
			break;
			case 2: obj=new Seden();
			obj.input();
			obj.display(obj);
			break;
			case 3: obj=new Luxary();
			obj.input();
			obj.display(obj);
			case 4: break;
			default: System.out.println("INVALID CHOICE....");
			break;
			}
		}while(ch!=4);
	}

}
