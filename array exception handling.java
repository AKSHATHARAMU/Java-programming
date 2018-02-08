package sample;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		 
		 try
		 {
		        int n, sum = 0;
		        Scanner s = new Scanner(System.in);
		        System.out.print("Enter no. of elements you want in array:");
		        n = s.nextInt();
		        int a[] = new int[n];
		        System.out.println("Enter all the elements:");
		        for(int i = 0; i < n; i++)
		        {
		            a[i] = s.nextInt();
		            sum = a[5]+a[1];
		        }
		        System.out.println("Sum:"+sum);
		  }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println("Array index out of bound");
		 }
			 
		 }

}
