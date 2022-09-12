package com.dhiraj;
import java.util.Scanner;
public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.print("Enter first number:-");
		int n1= S.nextInt();
		System.out.print("Enter second number:-");
		int n2=S.nextInt();
		int s=n1+n2;
		int d=n1-n2;
		float k=(n1/n2);
		System.out.println("Sum="+s+"\ndiff="+d+"\ndiv="+k);
		}

}
