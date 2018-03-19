package com.bridgelabz.program;
/***************************************************************************
 * @purpose : Thread safe singleton pattern
 * @author  : Madhuri Chaudhari
 * @version : 1.0
 * @date    : 19/03/2018
 ***************************************************************************/
public class ThreadSafeSigleton 
{
	private static ThreadSafeSigleton instance;
	
	//private constructor
	private ThreadSafeSigleton()
	{
		
	}
	//
	public static ThreadSafeSigleton getInstance()
	{
		if(instance == null)
		{
			instance = new ThreadSafeSigleton();
		}
		return instance;
	}
	//double checked locking implementation.
	public static ThreadSafeSigleton getInstanceUsingDoubleLocking()
	{
	    if(instance == null)
	    {
	        synchronized (ThreadSafeSigleton.class) 
	        {
	            if(instance == null)
	            {
	                instance = new ThreadSafeSigleton();
	            }
	        }
	    }
	    return instance;
	}
}
