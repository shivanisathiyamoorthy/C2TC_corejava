package com.cg.dayseven;

public class Overload {
	static void add(int a,int b) {
		 int c=a+b;
			System.out.println("Addition of 2 numbers "+c);
		}
	 static void add() {
		 System.out.println("Addition method");
	 }
	static void add(int a,int b,int c) {
		int d=a+b+c;
		System.out.println("Addition of 3 numbers "+d);
	}
	}
	class Main1{
		public static void main(String[] args) {
			System.out.println(Overload.add());
			System.out.println(Overload.add(20, 76));
			System.out.println(Overload.add(20, 76,10));
			

		}
	}

