package com.bridgelabz.designpattern.visitorpattern;

public interface Items 
	{
		int accept(ShoppingCartVisitor visitor);
	}

interface ShoppingCartVisitor
	{
		int visit(Book book);
		int visit(Fruit fruit);
	}
