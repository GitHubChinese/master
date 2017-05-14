package com.builder;

public class SubMealBuilderB extends MealBuilder {

	private Meal meal;
	
	@Override
	public void buildFood() {
		System.out.println("SubMealBuilderB��buildFood()  ");
	}

	@Override
	public void buildDrink() {
		System.out.println("SubMealBuilderB��buildDrink()  ");
	}

	@Override
	public Meal getMeal() {
		return meal;
	}

}
