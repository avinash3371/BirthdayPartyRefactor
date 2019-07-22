package com.birthdayparty.cake.decorator;

public class MangoMouseWithStrawBerryFrostingCake implements Cake {

	private Cake cake;

	public MangoMouseWithStrawBerryFrostingCake(Cake cake) {
		this.cake = cake;
	}

	@Override
	public CakeFrosting getCakeFrosting() {

		return CakeFrosting.STRABERRY;
	}

	@Override
	public CakeFlavor getFlavor() {

		return CakeFlavor.MANGO;
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
		return CakeColor.YELLOW;
	}
}
