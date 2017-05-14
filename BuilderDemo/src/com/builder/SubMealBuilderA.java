package com.builder;

public class SubMealBuilderA extends MealBuilder {
	
	private Meal meal;

	@Override
	public void buildFood() {
		System.out.println("SubMealBuilderA£ºbuildFood()");
	}

	@Override
	public void buildDrink() {
		System.out.println("SubMealBuilderA£ºbuildDrink()");
	}

	@Override
	public Meal getMeal() {
		return meal;
	}

}
