package javaProject;
import java.util.*;
import com.newpackage.CalcNew;


public class Arithmetic {
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first integer");
		int a = sc.nextInt();
		System.out.println("Enter second integer ");
		int b = sc.nextInt();
		Calc cal= new Calc();//Object creation for class(inside main)
		
		cal.add(a,b);// method is not static so objname.methodname same package diff class
		Calc.sub(a,b);//Static method -->class.methodname same package diff class
		
		CalcNew calc =new CalcNew();// object creation for CalcNew class in different package
		calc.add(a,b);
		CalcNew.sub(a, b);
	}
	
	}
