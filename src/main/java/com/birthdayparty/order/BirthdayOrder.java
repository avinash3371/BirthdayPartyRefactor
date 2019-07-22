package com.birthdayparty.order;

import com.birthdayparty.balloon.builder.Balloon;
import com.birthdayparty.cake.decorator.Cake;

public interface BirthdayOrder {

	void orderBalloons(Balloon balloon, int quantity) throws OrderProcessingException;

	void orderCake(Cake cake) throws OrderProcessingException;
}
