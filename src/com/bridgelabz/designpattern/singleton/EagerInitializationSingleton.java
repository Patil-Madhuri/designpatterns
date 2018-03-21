package com.bridgelabz.designpattern.singleton;
/***************************************************************************
 * @purpose : Eager intialization singleton pattern
 * @author  : Madhuri Chaudhari
 * @version : 1.0
 * @date    : 19/03/2018
 ***************************************************************************/
public class EagerInitializationSingleton 
{
	private static final EagerInitializationSingleton instance = 
			new EagerInitializationSingleton();
	
	//private constructor to avoid client applications to use constructor
	private EagerInitializationSingleton()
	{
		
	}
	
/*	In eager initialization, the instance of Singleton Class is created at 
	the time of class loading, this is the easiest method to create a singleton class
*/	public static EagerInitializationSingleton getInstance()
	{
		return instance;
	}
	
}
