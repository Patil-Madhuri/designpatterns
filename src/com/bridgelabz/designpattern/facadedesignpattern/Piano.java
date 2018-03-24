package com.bridgelabz.designpattern.facadedesignpattern;
/**
 *
 * @author PUSHPA
 */
public class Piano implements InstumentShop {

	@Override
	public void instrumentType() {
		
		 System.out.println(" Musical instrument ");  
	}

	@Override
	public void price() {
		System.out.println("RS 1000");
	}
   
    
}