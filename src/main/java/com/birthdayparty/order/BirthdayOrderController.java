package com.birthdayparty.order;

import com.birthdayparty.balloon.builder.Balloon;
import com.birthdayparty.balloon.builder.BalloonColor;
import com.birthdayparty.balloon.builder.BalloonMaterial;
import com.birthdayparty.cake.decorator.Cake;
import com.birthdayparty.cake.decorator.FullSheetSizeDecorator;
import com.birthdayparty.cake.decorator.MangoMouseWithStrawBerryFrostingCake;
import com.birthdayparty.cake.decorator.StandardCake;

public class BirthdayOrderController {

	// assume this is the only order that we want to create right now
	// we can create new orders in junit consumer classes
	public void order() throws OrderProcessingException {

		// assuming this is very simple Birthday party application
		// I am not going into details of how we can implement a shopping cart
		// application,
		// where i can add below items in shopping cart and then checkout

		// This is very simple birthday order submission application

		// Assume this is what the birthday party host do , he goes to one seller and
		// give below order
		// the seller basically can fullfill the order from different providers
		// the seller will charge total cost of products to customer , which details i
		// am not including
		// to keep the application simple and easy as of now

		BirthdayOrder birthdayOrder = new BirthdayOrderProcessor();

		Balloon cartItem1 = new Balloon.BalloonBuilder(BalloonColor.RED, BalloonMaterial.MYLAR).build();
		birthdayOrder.orderBalloons(cartItem1, 4);

		Balloon cartItem2 = new Balloon.BalloonBuilder(BalloonColor.BLUE, BalloonMaterial.LATEX).fillWithHeliumGas()
				.build();
		birthdayOrder.orderBalloons(cartItem2, 7);

		Cake mangoCake = new FullSheetSizeDecorator(new MangoMouseWithStrawBerryFrostingCake(new StandardCake()));
		birthdayOrder.orderCake(mangoCake);

	}
}
