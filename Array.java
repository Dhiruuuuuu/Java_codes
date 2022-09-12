package com.dhiraj;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.print("Enter the size of array :-");
		int n1= S.nextInt();
		String a[]=new String[n1];
		for(int i=0;i<n1;i++)
		{
			System.out.print("Enter " +i+"th element:-");
			a[i]= S.next();
			System.out.println();
			
		}
		for(int i=0;i<n1;i++)
		{
			System.out.println(i+"th element:-"+a[i]);
			
		}
		
	}

}
