package com.bridgelabz.designpattern.proxypattern.internet;

public class ProxyInternetAccess implements OfficeInternetAccess
{
	private String employeeName;
	RealInternetAccess realaccess;
	public ProxyInternetAccess(String employeeName)
	{
		this.employeeName = employeeName;
	}

	@Override
	public void grantInternetAccess() 
	{
		  if (getRole(employeeName) > 2)   
          {  
              realaccess = new RealInternetAccess(employeeName);  
              realaccess.grantInternetAccess();  
          }   
          else   
          {  
              System.out.println("No Internet access granted. Your job level is below 5");  
          }  
      }  
      public int getRole(String emplName)
      {  
          // Check role from the database based on Name and designation  
          // return job level or job designation.  
          return 9;  
      }  

}
