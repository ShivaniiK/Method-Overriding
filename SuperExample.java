package com.MethodOverriding;

	public class SuperExample extends SuperOverride
	{
	   private double height;

	   /*  Sets length, width and height of box*/
	   public void setSuperExample(double length, double width, double height)
	   {
	      mysetSuperExample(length, width, height);
	      this.length  = length;
	      this.width  = width;
	      this.height  = height;
	   }


	private void mysetSuperExample(double length, double width, double height) {
		 		
	}

	/* The toString method overrides the Rectangle's toString method
	     and returns length, width and height of box as string
	    */
	   public String toString()
	   {
	      return super.toString() +    //Calling Rectangle's toString method
	           "\nHeight : " + height;
	   }
	}
	
	
	
	
	class Maharashtra extends India {

		  // overriding method
		  @Override
		  public void display(){
		    System.out.println("Maharashtra is one of the state in India");
		  }

		  public void printMessage()
		  {
			  super.display();
		    
		   
		  }
		}
	
	
	
	
