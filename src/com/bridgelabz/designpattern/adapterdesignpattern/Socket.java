package com.bridgelabz.designpattern.adapterdesignpattern;

public class Socket
{
	public Volt getVolt()
	{
		return new Volt(120);
	}
}
