package com.birthdayparty.cake.decorator;

public class StandardCake implements Cake {

	// these can be open ended attribute like it can be customized cake ,
	// as of now consider these are the only options and there are prebuild cake
	// options are available

	public CakeFrosting getCakeFrosting() {

		return CakeFrosting.BUTTERMILK;
	}

	public CakeFlavor getFlavor() {
		return CakeFlavor.VANNILA;
	}

	public CakeShape getShape() {
		return CakeShape.ROUND;
	}

	public CakeSize getSize() {
		return CakeSize.EIGHTINCH;
	}

	public CakeColor getColor() {
		return CakeColor.WHITE;
	}

}
