package com.epam.DesignPrinciples;

import java.util.Scanner;

public class kissPrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Double num1 = sc.nextDouble();
		Double num2 = sc.nextDouble();
		System.out.println("1 for Addition\n 2 for Subtraction\n3 for Multiplication\n4 for division\n 5 for modolous ");
		int op = sc.nextInt();
		System.out.println("Result: "+result(num1,num2,op));

	}

	private static Double result(Double num1, Double num2, int op) {
		// TODO Auto-generated method stub
		Double res[] = {num1+num2,num1-num2,num1*num2,num1/num2,num1%num2};
		return res[op-1];
	}

}
