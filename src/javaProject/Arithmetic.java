package javaProject;
import java.util.*;


public class Arithmetic {
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first integer");
		int a = sc.nextInt();
		System.out.println("Enter second integer ");
		int b = sc.nextInt();
		Arithmetic cal= new Arithmetic();
		cal.add(a,b);
		sub(a,b);
		
	}
	
	//Method for Addition
	public void add(int a, int b){
		int result= a+b;
		System.out.println("The sum of given two numbers is" +result);

	}
	//Method for Subtraction
	public static void sub(int a, int b) {
		int result=a-b;
		System.out.println("The subtraction of given two numbers is" +result);
		
	}
	//Method for Multiplication
	public void mul(int a, int b) {
		int result= a*b;
		System.out.println("The multiplication of given numbers is " +result);
	
	}
	//Method for division
	public void div(int a, int b) {
			int result= a/b;
			System.out.println("The division of given numbers is " +result);
		
		
	}
}
