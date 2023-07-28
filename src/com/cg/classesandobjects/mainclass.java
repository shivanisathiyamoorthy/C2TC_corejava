package com.cg.classesandobjects;

import java.util.Scanner;

public class mainclass {

	public static void main(String[] args) {
		methodClass mv = new methodClass();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		mv.mul(a, b, c);
		
		
}


}
