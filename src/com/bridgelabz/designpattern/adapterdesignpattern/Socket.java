package com.bridgelabz.designpattern.adapterdesignpattern;
/******************************************************************************  
 *  Purpose: Socket class
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   20-03-2018
 ******************************************************************************/
public class Socket
{
	public Volt getVolt()
	{
		return new Volt(120);
	}
}
