package com.cg.daytwo;

import java.util.Scanner;
public class Elseifladder{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the stud mark: ");
		int n = sc.nextInt();
		if(n>100) {
			System.out.println("Please Enter the Valid Mark");
		}
		else if(n>90) {
			System.out.println("Grade O");
		}
		else if(n>80 && n<=90) {
			System.out.println("Grade A+");
		}
		else if(n>70 && n<=80) {
			System.out.println("Grade A");
		}
		else if(n>60 && n<=70) {
			System.out.println("Grade B");
		}
		else if(n>50 && n<=60) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Fail");
		}

	}

}
	
