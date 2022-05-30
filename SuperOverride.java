package com.MethodOverriding;

public class SuperOverride 
	{
	   protected double length;
	   protected double width;

	   /* Sets length and width of rectangle*/
	   public void setRectangle(double length, double width)
	   {
	      this.length = length;
	      this.width  = width;
	   }

	   /* Returns length and width as string*/
	   public String toString()
	   {
	      return "Length : " + length + "\nWidth : " + width;
	   }
	}



class India {

	  // overridden method
	  public void display(){
	    System.out.println("India is my Country");
	  }
	}


class Company {
	
	private int salary;
	int experience;

	  // overridden method
	  final void emp(){
	    salary = 5000 + (2000*2);
	    }
	}






