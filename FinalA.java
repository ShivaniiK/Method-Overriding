package com.MethodOverriding;

public class FinalA {

	public final String strCollege = "Symbiosis Institute";
	
	public void printCollegeName(String strCollegeName) {
		strCollegeName = strCollege;
		System.out.println("College name is : "+strCollegeName);
	}
}

