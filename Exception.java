package practical;
import java.util.*;
public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input1;
		String input2;
		System.out.println("Enter first number(num 1): ");
		input1=sc.nextLine();
		System.out.println("Enter second number(num2): ");
		input2=sc.nextLine();
		try {
			int num1=Integer.parseInt(input1);
			int num2=Integer.parseInt(input2);
			if(num2==0) {
				throw new ArithmeticException("Division by zero is not allowed.");
			}
			int result=num1/num2;
			System.out.println("Division of (num1/num2): "+result);
		}catch(NumberFormatException e) {
			System.out.println("Number Format Exception: please enter integer value.");
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception: "+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception: "+e.getMessage());
		}finally {
			sc.close();
		}
	}

}
