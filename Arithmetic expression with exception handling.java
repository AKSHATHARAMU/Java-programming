package sample;
import java.util.Scanner;
public class Division {
	public static void main(String[] args) {
		 
		  int a, b, result;
		  Scanner sc=new Scanner(System.in);
		    System.out.println("Input two integers");
		 try
		 {
		  a = sc.nextInt();
		  b = sc.nextInt();
		 
		  result = a / b;
		 
		  System.out.println("Result = " + result);
		  }
		 catch(ArithmeticException e)
		 {
			 System.out.println("Do not divide by zero");
		 }
			 
		 }

}
