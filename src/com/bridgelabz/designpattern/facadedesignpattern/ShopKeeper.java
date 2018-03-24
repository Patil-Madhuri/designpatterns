package com.bridgelabz.designpattern.facadedesignpattern;

//Create a ShopKeeper concrete class that will use MobileShop interface.
/**Purpose: This class use Cake Shop interface
* @author 
* @since 13-03-2018
*/
public class ShopKeeper {
	
	public InstumentShop gitar;
	public InstumentShop piano;
      public InstumentShop violin;
      public InstumentShop flute;
      public InstumentShop drum;
	
	public ShopKeeper()
	{
		gitar=new Gitar();
		piano=new Piano();
		violin =new Violin();
		flute=new Flute(); 
		drum = new Drum();
	}
	
	public void gitarSale()
	{
		// TODO Auto-generated method stub
		gitar.instrumentType();
		gitar.price();
	}
	
	public void pianoSale() 
	{
		piano.instrumentType();
		piano.price();
	
	}
      public void violinSale() 
      {
		violin.instrumentType();
		violin.price();
      }
      public void fluteSale() 
      {
    	  flute.instrumentType();
    	  flute.price();
      }
      
      public void drumSale()
      {
    	  drum.instrumentType();
    	  drum.price();
      }
}