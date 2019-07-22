package com.birthdayparty.cake.decorator;

public class HalfSheetSizeDecorator implements Cake {

	private Cake cake;

	public HalfSheetSizeDecorator(Cake cake) {
		this.cake = cake;
	}

	@Override
	public CakeFrosting getCakeFrosting() {
		return cake.getCakeFrosting();
	}

	@Override
	public CakeFlavor getFlavor() {
		return cake.getFlavor();
	}

	@Override
	public CakeShape getShape() {
		return CakeShape.RECTANGLE;
	}

	@Override
	public CakeSize getSize() {
		return CakeSize.HALFSHEET;
	}

	@Override
	public CakeColor getColor() {
		return cake.getColor();
	}

}
