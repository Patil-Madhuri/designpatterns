package com.bridgelabz.designpattern.proxypattern.internet;

import java.util.Scanner;

public class ProxyPatternClient
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the user name");
		String username = scanner.next();
	    OfficeInternetAccess access = new ProxyInternetAccess(username);  
	    access.grantInternetAccess();  
	    scanner.close();
}
}
