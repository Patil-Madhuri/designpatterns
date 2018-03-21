package com.bridgelabz.designpattern.singleton;
/***************************************************************************
 * @purpose : Using Reflection to destroy Singleton Pattern
 * @author  : Madhuri Chaudhari
 * @version : 1.0
 * @date    : 19/03/2018
 ***************************************************************************/
import java.lang.reflect.Constructor;

public class ReflectionSingletonTest 
{
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		EagerInitializationSingleton instance1 = 
				EagerInitializationSingleton.getInstance();
		
		EagerInitializationSingleton instance2 = null;
		
		try
		{
			 Constructor[] constructors = EagerInitializationSingleton.
					 class.getDeclaredConstructors();
	            for (Constructor constructor : constructors)
	            {
	                //Below code will destroy the singleton pattern
	                constructor.setAccessible(true);
	                instance2 = (EagerInitializationSingleton) constructor.newInstance();
	                break;
	            }
		}      
		catch(Exception e)
	      {
	      	e.printStackTrace();
	      }
		
		System.out.println("Hash code of first instance: "+instance1.hashCode());
		System.out.println("Hash code of second instance: "+instance2.hashCode());
		
	}
}
