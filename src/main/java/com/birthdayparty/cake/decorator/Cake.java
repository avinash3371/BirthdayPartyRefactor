package com.birthdayparty.cake.decorator;

public interface Cake {
	CakeFrosting getCakeFrosting();

	CakeFlavor getFlavor();

	CakeShape getShape();

	CakeSize getSize();

	CakeColor getColor();
}
