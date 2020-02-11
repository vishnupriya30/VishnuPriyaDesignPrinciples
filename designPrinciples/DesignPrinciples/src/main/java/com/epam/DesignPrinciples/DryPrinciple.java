package com.epam.DesignPrinciples;

import java.util.Scanner;

public class DryPrinciple {

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
		default: System.out.println("Invalid operator");
			
		}
		// TODO Auto-generated method stub

	}

	private static Double div(Double num1, Double num2) {
		double quo = 0;
		while(num1>=num2) {
			quo++;
			num1 = sub(num1,num2);
		}
		return quo;
	}

	private static Double mul(Double num1, Double num2) {
		double pro = 0.0;
		// TODO Auto-generated method stub
		for(int i = 1;i <= num2; i++){
			pro = add(pro,num1);
		}
		return pro;
	}

	private static Double sub(Double num1, Double num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	private static Double add(Double num1, Double num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

}
