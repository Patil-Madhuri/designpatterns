package com.bridgelabz.designpattern.singleton;
/***************************************************************************
 * @purpose : Serialized Singleton Pattern
 * @author  : Madhuri Chaudhari
 * @version : 1.0
 * @date    : 19/03/2018
 ***************************************************************************/
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonSerializedTest
{
	public static void main(String[] args) 
	{
		SerializedSingleton instance = SerializedSingleton.getInstance();
		try
		{
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("serialized.ser"));
			out.writeObject(instance);
			out.close();
			
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("serialized.ser"));
			SerializedSingleton instance2 = (SerializedSingleton) input.readObject();
			input.close();
			
			System.out.println("Hash code of first instance: "+instance.hashCode());
			System.out.println("Hash code of second instance: "+instance2.hashCode());
		}
		catch (IOException | ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	}
}
