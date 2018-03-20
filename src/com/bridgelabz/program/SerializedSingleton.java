package com.bridgelabz.program;
/***************************************************************************
 * @purpose : Serialized Singleton Pattern
 * @author  : Madhuri Chaudhari
 * @version : 1.0
 * @date    : 19/03/2018
 ***************************************************************************/
import java.io.Serializable;

public class SerializedSingleton implements Serializable
{
	 private static final long serialVersionUID = -7604766932017737115L;
	 //private constructor
	 private SerializedSingleton()
	 {
		 
	 }
	 public static class SingletonHelper
	 {
		 private static final SerializedSingleton instance = new SerializedSingleton();
	 }
	 
	 public static SerializedSingleton getInstance()
	 {
		 return SingletonHelper.instance;
	 }
	
}
