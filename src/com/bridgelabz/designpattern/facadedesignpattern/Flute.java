package com.bridgelabz.designpattern.facadedesignpattern;
/**
*
* @author Madhuri
*/
public class Flute implements InstumentShop {
  
	@Override
	public void price() {
		
	    System.out.println(" Rs 750 ");  
	}

	@Override
	public void instrumentType() {
		System.out.println("Musical instrument");
		
	}  
   
}