package com.sandeep.samplegit;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculator Function");
		Calculator calc1 = new Calculator();
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the first no for addition:");
		calc1.number1 = scan1.nextInt();
		scan1.nextLine();
		System.out.println("Enter the second no for addition:");
		calc1.number2 = scan1.nextInt();
		scan1.close();
		System.out.println("Sum of 2 numbers is " +calc1.addNumber());
		System.out.println("Difference of 2 numbers is " +calc1.subtractNumber());
	}

}
