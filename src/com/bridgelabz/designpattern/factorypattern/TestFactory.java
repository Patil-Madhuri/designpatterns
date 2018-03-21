package com.bridgelabz.designpattern.factorypattern;

public class TestFactory 
{
	public static void main(String[] args) 
	{
		Computer pc = ComputerFactory.getComputer("PC", "2GB","500GB","2.4GHz" );
		Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC Config:: "+"\n"+pc);
		System.out.println("\nFactory Server Config:: "+ "\n"+server);
	}
}
