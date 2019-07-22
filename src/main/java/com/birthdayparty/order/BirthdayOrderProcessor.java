package com.birthdayparty.order;

import com.birthdayparty.balloon.builder.Balloon;
import com.birthdayparty.cake.decorator.Cake;

public class BirthdayOrderProcessor implements BirthdayOrder {

	@Override
	public void orderBalloons(Balloon balloon, int quantity) {
		// for the purposes of this exercise, pretend this method works and adds
		// balloons to the order
		System.out.println("Balloons ordered; " + balloon.getColor() + ", " + balloon.getMaterial() + ", " + quantity
				+ " ," + balloon.isHeliumFilled());

	}

	@Override
	public void orderCake(Cake cake) {
		// for the purposes of this exercise, pretend that this method adds a cake to
		// the order
		System.out.println("cake ordered; " + cake.getFlavor() + ", " + cake.getCakeFrosting() + ", " + cake.getShape()
				+ ", " + cake.getSize() + ", " + cake.getColor());

	}

}
