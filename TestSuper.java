package com.MethodOverriding;

import java.util.Scanner;

public class TestSuper {

	public static void main(String[] args) {
		 double length, width, height;
        
	      // Scanner object for keyboard input.
	      Scanner console = new Scanner(System.in);

	      // Get length of box.
	      System.out.print("Enter the length of box : ");
	      length = console.nextDouble();

	      // Get width of box.
	      System.out.print("Enter the width of box : ");
	      width = console.nextDouble();

	      // Get height of box.
	      System.out.print("Enter the height of box : ");
	      height = console.nextDouble();

	      // setSuperExample object.
	      SuperExample mySuperExample = new SuperExample();

	      // Set length, width and height of box.
	      mySuperExample.setSuperExample(length, width, height);

	      // Display the box details.
	      System.out.println(mySuperExample);
	      
	      System.out.println("===========================");
	      Maharashtra objMaharashtra = new Maharashtra();
	      objMaharashtra.printMessage();
	      
	      System.out.println("===========================");
	      Company objCompany = new Company();
	      objCompany.emp();
	  }
}

	      
	  
	   
	