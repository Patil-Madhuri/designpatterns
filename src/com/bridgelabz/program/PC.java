package com.bridgelabz.program;

public class PC extends Computer
{

	private String ram,hdd,cpu;
	
	public PC(String ram, String hdd, String cpu) 
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
