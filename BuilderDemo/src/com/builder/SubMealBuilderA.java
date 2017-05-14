package com.builder;

public class SubMealBuilderA extends MealBuilder {
	
	private Meal meal;

	@Override
	public void buildFood() {
		System.out.println("SubMealBuilderA��buildFood()");
	}

	@Override
	public void buildDrink() {
		System.out.println("SubMealBuilderA��buildDrink()");
	}

	@Override
	public Meal getMeal() {
		return meal;
	}

}
