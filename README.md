package practical;
import java.util.*;
public class Complex {
	double real,img;
	Complex(){
		real=0.0;
		img=0.0;
	}
	Complex(double c1,double c2){
		real=c1;
		img=c2;
	}
	void Addnumber(Complex s1,Complex s2) {
		double real,img,real1,real2,img1,img2;
		real1=s1.real;
		real2=s2.real;
		img1=s1.img;
		img2=s2.img;
		real=(s1.real+s2.real);
		img=(s1.img+s2.img);
		System.out.println("The first complex number is: ("+real1+")+("+img1+")i");
		System.out.println("The second number is: ("+real2+")+("+img2+")i");
		System.out.println("The addition is: ("+real+")+("+img+")i");
	}
	void Subnumber(Complex s1,Complex s2) {
		real=(s1.real-s2.real);
		img=(s1.img-s2.img);
		System.out.println("The subtraction is: ("+real+")+("+img+")i");
	}
	void Mulnumber(Complex s1,Complex s2) {
		real=(s1.real*s2.real)-(s1.img*s2.img);
		img=(s1.real*s2.img)+(s1.real*s1.img);
		System.out.println("The multiplecation is: ("+real+")+("+img+")i");
	}
	void Divnumber(Complex s1,Complex s2) {
		real=((s1.real*s2.real)+(s1.img*s2.img))/((s1.img*s2.img)+s1.img*s2.img);
		img=((s1.real*s2.img)-(s1.img*s2.real))/((s1.img*s2.img)+(s1.img*s2.img));
		System.out.println("The division is: ("+real+")+("+img+")i");
	}
	public static void main(String[] args) {
		double num1,num2;
		Complex obj=new Complex();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		Complex obj1=new Complex(num1,num2);
		System.out.println("Enter second number: ");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		Complex obj2=new Complex(num1,num2);
		obj.Addnumber(obj1, obj2);
		obj.Subnumber(obj1,obj2);
		obj.Mulnumber(obj1, obj2);
		obj.Divnumber(obj1,obj2);
	}
}
