package com.birthdayparty.cake.decorator;

public class ChocolateWithVannilaFrostingCake implements Cake {

	private Cake cake;

	public ChocolateWithVannilaFrostingCake(Cake cake) {
		this.cake = cake;
	}

	@Override
	public CakeFrosting getCakeFrosting() {

		return cake.getCakeFrosting();
	}

	@Override
	public CakeFlavor getFlavor() {

		return CakeFlavor.CHOCOLATE;
	}

	@Override
	public CakeShape getShape() {
		return cake.getShape();
	}

	@Override
	public CakeSize getSize() {
		return cake.getSize();
	}

	@Override
	public CakeColor getColor() {
		return CakeColor.WHITE;
	}
}
