package com.bridgelabz.program;
/***************************************************************************
 * @purpose : Lazy intialization singleton pattern
 * @author  : Madhuri Chaudhari
 * @version : 1.0
 * @date    : 19/03/2018
 ***************************************************************************/
public class LazyInitializedSingleton 
{
	private static LazyInitializedSingleton instance;
	
	//private constructor
	private LazyInitializedSingleton()
	{
		
	}
	
	/*Lazy initialization method to implement Singleton pattern 
	creates the instance in the global access method.*/ 
	public static LazyInitializedSingleton getInstance()
	{
		if(instance == null)
		{
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
}
