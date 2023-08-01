package com.cg.daytwo;

public class Nestedfor {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++)
		  {
		 // Inner for loop.
			for(int j = 1; j <= i; j++){
		     System.out.print("*"+ " ");
		    }
		   System.out.println(" ");
		  }
	}

}
