package com.bridgelabz.designpattern.facadedesignpattern;

/**
 *
 * @author Madhuri
 */
public class Gitar implements InstumentShop{
    

	@Override
	public void instrumentType() {
	
		 System.out.println(" String instrument ");  
	}

	@Override
	public void price() {
	
	    System.out.println(" Rs 700 ");  
	}  

}