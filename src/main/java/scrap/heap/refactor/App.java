package scrap.heap.refactor;

import com.birthdayparty.balloon.builder.Balloon;
import com.birthdayparty.balloon.builder.BalloonColor;
import com.birthdayparty.balloon.builder.BalloonMaterial;
import com.birthdayparty.cake.decorator.Cake;
import com.birthdayparty.cake.decorator.FullSheetSizeDecorator;
import com.birthdayparty.cake.decorator.MangoMouseWithStrawBerryFrostingCake;
import com.birthdayparty.cake.decorator.StandardCake;
import com.birthdayparty.order.BirthdayOrder;
import com.birthdayparty.order.BirthdayOrderProcessor;
import com.birthdayparty.order.OrderProcessingException;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) throws OrderProcessingException {

    	BirthdayOrder birthdayOrder = new BirthdayOrderProcessor();

		Balloon cartItem1 = new Balloon.BalloonBuilder(BalloonColor.RED, BalloonMaterial.MYLAR).build();
		birthdayOrder.orderBalloons(cartItem1, 4);

		Balloon cartItem2 = new Balloon.BalloonBuilder(BalloonColor.BLUE, BalloonMaterial.LATEX).fillWithHeliumGas()
				.build();
		birthdayOrder.orderBalloons(cartItem2, 7);

		Cake mangoCake = new FullSheetSizeDecorator(new MangoMouseWithStrawBerryFrostingCake(new StandardCake()));
		birthdayOrder.orderCake(mangoCake);
    }

    private static void order(String balloonColor, String material, String number, String flavor, String frostingFlavor, String shape, String size, String cakeColor){

        orderBalloons(balloonColor, material, number);

        orderCake(frostingFlavor, flavor, shape, size, cakeColor);
    }

    private static void orderBalloons(String balloonColor, String material, String number){

        //for the purposes of this exercise, pretend this method works and adds balloons to the order
        System.out.println("Balloons ordered; " + balloonColor + ", " + material  + ", " + number);

    }

    private static void orderCake(String flavor, String frostingFlavor, String shape, String size, String cakeColor){

        //for the purposes of this exercise, pretend that this method adds a cake to the order
        System.out.println("cake ordered; " + flavor + ", " + frostingFlavor  + ", " + shape + ", " + size + ", " + cakeColor);

    }

}
