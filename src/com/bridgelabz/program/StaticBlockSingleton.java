package com.bridgelabz.program;
/***************************************************************************
 * @purpose : static block intialization singleton pattern
 * @author  : Madhuri Chaudhari
 * @version : 1.0
 * @date    : 19/03/2018
 ***************************************************************************/
public class StaticBlockSingleton 
{
	private static StaticBlockSingleton instance;
	private StaticBlockSingleton()
	{
		
	}
	
	   //static block initialization for exception handling
	static
	{
		try
		{
			instance = new StaticBlockSingleton();
		}
		catch(Exception e)
		{
			throw new RuntimeException("Error occur in creating singleton instance");
		}
	}
	
	public static StaticBlockSingleton getInstance()
	{
		return instance;
	}
}
