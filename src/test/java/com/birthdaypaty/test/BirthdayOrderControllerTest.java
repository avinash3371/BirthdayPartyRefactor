package com.birthdaypaty.test;

import org.junit.Test;

import com.birthdayparty.balloon.builder.Balloon;
import com.birthdayparty.balloon.builder.BalloonColor;
import com.birthdayparty.balloon.builder.BalloonMaterial;
import com.birthdayparty.cake.decorator.Cake;
import com.birthdayparty.cake.decorator.ChocolateWithVannilaFrostingCake;
import com.birthdayparty.cake.decorator.HalfSheetSizeDecorator;
import com.birthdayparty.cake.decorator.StandardCake;
import com.birthdayparty.order.BirthdayOrder;
import com.birthdayparty.order.BirthdayOrderController;
import com.birthdayparty.order.BirthdayOrderProcessor;
import com.birthdayparty.order.OrderProcessingException;

public class BirthdayOrderControllerTest {

	@Test
	public void testBirthdayOrder() throws OrderProcessingException {

		BirthdayOrderController birthdayOrderController = new BirthdayOrderController();

		birthdayOrderController.order();

	}

	@Test
	public void testBirthdayOrderNew() throws OrderProcessingException {

		BirthdayOrder birthdayOrder = new BirthdayOrderProcessor();

		Balloon cartItem1 = new Balloon.BalloonBuilder(BalloonColor.BLUE, BalloonMaterial.MYLAR).fillWithHeliumGas()
				.build();
		birthdayOrder.orderBalloons(cartItem1, 10);

		Balloon cartItem2 = new Balloon.BalloonBuilder(BalloonColor.SILVER, BalloonMaterial.LATEX).build();
		birthdayOrder.orderBalloons(cartItem2, 9);

		Cake mangoCake = new HalfSheetSizeDecorator(new ChocolateWithVannilaFrostingCake(new StandardCake()));
		birthdayOrder.orderCake(mangoCake);

		birthdayOrder.orderCake(new StandardCake());

	}

}
