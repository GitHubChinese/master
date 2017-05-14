package com.builder;

public class SubMealBuilderB extends MealBuilder {

	private Meal meal;
	
	@Override
	public void buildFood() {
		System.out.println("SubMealBuilderB£ºbuildFood()  ");
	}

	@Override
	public void buildDrink() {
		System.out.println("SubMealBuilderB£ºbuildDrink()  ");
	}

	@Override
	public Meal getMeal() {
		return meal;
	}

}
