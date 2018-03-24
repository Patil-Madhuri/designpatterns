package com.bridgelabz.designpattern.facadedesignpattern;

import java.util.Scanner;
public class FacadePatternClient 
{
	private static int choice;
	static
	{
		System.out.print("*** MUSICAL INSTRUMENT SHOP ***\n");
	}
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		do {
				
				System.out.print("  1. Gitar.\n");
				System.out.print("  2. Piano.\n");
				System.out.print("  3. Violin.\n");
	            System.out.print("  4. Flute.\n");
	            System.out.print("  5. Drum.\n");
	            System.out.print("  6. Exit.\n");
				System.out.println("Enter your choice : ");
				choice = scanner.nextInt();
		
				ShopKeeper shopKeeper= new ShopKeeper();
	
				switch (choice) 
				{
				case 1: 
					shopKeeper.gitarSale();
					break;
				case 2: 
					shopKeeper.pianoSale();
					break;
				case 3: 
	                shopKeeper.violinSale();
	                break;
	            case 4: 
	            	shopKeeper.fluteSale();
	                break;
	            case 5:
	            	shopKeeper.drumSale();
	            	break;
	            case 6:
	            	System.out.println("....Thanks....");
	            	System.exit(0);
	
				default: 
					System.out.println("Nothing You purchased");
				
				}
	
			} while (choice > 0);
		scanner.close();
	}
}