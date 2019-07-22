package com.birthdayparty.cake.decorator;

public class FullSheetSizeDecorator implements Cake {

	private Cake cake;

	public FullSheetSizeDecorator(Cake cake) {
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
		return CakeSize.FULLSHEET;
	}

	@Override
	public CakeColor getColor() {
		return cake.getColor();
	}

}
