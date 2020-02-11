package com.epam.DesignPrinciples;

import java.util.Scanner;

public class SolidPrinciple extends Calculator {

	public static void main(String[] args){
		Calculator c =new SolidPrinciple();
		Scanner sc=new Scanner(System.in);
		double a[]=new double[2];
		for(int i=0;i<2;i++) {
			a[i]=sc.nextDouble();
		}
		char op=sc.next().charAt(0);
		switch(op) {
		case '+':
			System.out.println("Addition:" +c.add(a[0],a[1]));
		         break;
		         
		case '-':
			System.out.println("Difference:"+c.sub(a[0],a[1]));
		         break;
		case '*':
			System.out.println("Product :"+c.mul(a[0],a[1]));
		         break;
		case '/':
			System.out.println("Quotient:"+c.div(a[0],a[1]));
		         break;
		default:
			System.out.println("invalid operator");
		}
		// TODO Auto-generated method stub
	}

	@Override
	public double add(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public double sub(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	@Override
	public double mul(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public double div(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}

}
