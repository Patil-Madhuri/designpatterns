package com.bridgelabz.program;
/***************************************************************************
 * @purpose : Bill Pugh singleton pattern
 * @author  : Madhuri Chaudhari
 * @version : 1.0
 * @date    : 19/03/2018
 ***************************************************************************/
public class BillPughSingleton 
{
	//private constructor
	private BillPughSingleton()
	{
		
	}
	
	private static class SingletonHelper
	{
		private static final BillPughSingleton instance = 
				new BillPughSingleton();
	}
	
	/* When the singleton class is loaded, SingletonHelper class is not 
	loaded into memory and only when someone calls the getInstance method,
	this class gets loaded and creates the Singleton class instance.*/
	public static BillPughSingleton getInstance()
	{
		return SingletonHelper.instance;
	}
}
