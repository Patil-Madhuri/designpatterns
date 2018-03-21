package com.bridgelabz.designpattern.factorypattern;

public class Server extends Computer
{
	private String ram,hdd,cpu;
	
	public Server(String ram, String hdd, String cpu) 
	{
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	String getRAM() 
	{
		return this.ram;
	}

	@Override
	String getHDD() 
	{
		return this.hdd;
	}

	@Override
	String getCPU() 
	{
		return this.cpu;
	}
	
}
