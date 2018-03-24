package com.bridgelabz.designpattern.facadedesignpattern;

public class Drum implements InstumentShop
{

	@Override
	public void instrumentType() {
		System.out.println("Musical Instrument");
		
	}

	@Override
	public void price() {
		System.out.println("Rs 5000");
		
	}

}
