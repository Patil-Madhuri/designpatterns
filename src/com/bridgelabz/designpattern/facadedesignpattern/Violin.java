package com.bridgelabz.designpattern.facadedesignpattern;

/**
 *
 * @author PUSHPA
 */
public class Violin implements InstumentShop{
  

	@Override
	public void price() {
		// TODO Auto-generated method stub
	    System.out.println(" Rs 800 ");  
	}

	@Override
	public void instrumentType() {
		System.out.println("Musical Instrument");
		
	}  
    
}

