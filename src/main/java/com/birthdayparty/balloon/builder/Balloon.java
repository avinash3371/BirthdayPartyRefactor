package com.birthdayparty.balloon.builder;

public class Balloon {

	private BalloonColor color; // This is Required, so we'll pass it to the constructor.

	private BalloonMaterial material; // This is Required, so we'll pass it to the constructor.

	private boolean isHeliumFilled = false; // optional

	public BalloonColor getColor() {
		return color;
	}

	public BalloonMaterial getMaterial() {
		return material;
	}

	public boolean isHeliumFilled() {
		return isHeliumFilled;
	}

	private Balloon(BalloonBuilder ballonOrderBuilder) {

		this.color = ballonOrderBuilder.color;
		this.material = ballonOrderBuilder.material;
		this.isHeliumFilled = ballonOrderBuilder.isHeliumFilled;
	}

	public static class BalloonBuilder {

		private BalloonColor color; // required

		private BalloonMaterial material; // required

		private boolean isHeliumFilled = false; // optional

		public BalloonBuilder(BalloonColor color, BalloonMaterial material) {

			this.color = color;
			this.material = material;

		}

		public BalloonBuilder fillWithHeliumGas() {
			this.isHeliumFilled = true;
			return this;
		}

		public Balloon build() {

			Balloon balloon = new Balloon(this);

			return balloon;
		}

	}

}
