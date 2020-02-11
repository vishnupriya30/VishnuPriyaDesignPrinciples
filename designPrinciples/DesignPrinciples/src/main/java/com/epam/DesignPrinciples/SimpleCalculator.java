package com.epam.DesignPrinciples;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double num1 = sc.nextDouble();
		Double num2 = sc.nextDouble();
		char op = sc.next().charAt(0);
		switch(op){
		case '+': System.out.println("Addition : "+add(num1,num2));
		break;
		case '-': System.out.println("Difference : "+sub(num1,num2));
		break;
		case '*': System.out.println("Product : "+mul(num1,num2));
		break;
		case '/': System.out.println("Quotient : "+div(num1,num2));
		break;
		case '%': System.out.println("Remainder : "+mod(num1,num2));
		break;
		default: System.out.println("Invalid operator");
		}
		
		
		// TODO Auto-generated method stub

	}

	private static Double mod(Double num1, Double num2) {
		// TODO Auto-generated method stub
		Double rem = num1 % num2;
		return rem;
	}

	private static Double div(Double num1, Double num2) {
		Double quo = num1 / num2;
		// TODO Auto-generated method stub
		return quo;
	}

	private static Double mul(Double num1, Double num2) {
		// TODO Auto-generated method stub
		Double pro = num1 * num2;
		return pro;
	}

	private static Double sub(Double num1, Double num2) {
		// TODO Auto-generated method stub
		Double diff = num1 - num2;
		return diff;
	}

	private static Double add(Double num1, Double num2) {
		// TODO Auto-generated method stub
		Double sum = num1 + num2;
		return sum;
	}

}
