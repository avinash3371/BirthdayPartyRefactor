package com.birthdayparty.cake.decorator;

public interface Cake {
	CakeFrosting getCakeFrosting();

	CakeFlavor getFlavor();

	CakeShape getShape();

	CakeSize getSize();

	CakeColor getColor();
	
	
	//If we want to add some new behaviour in feature then we can use java 8 default methods , 
	// otherwise we need to make this as  abtract class
}
