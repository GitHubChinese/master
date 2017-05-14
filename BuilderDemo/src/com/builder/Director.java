package com.builder;

public class Director {
	
	private MealBuilder mb;
	
	public void setMealBuilder(MealBuilder mb){
		this.mb = mb;
	}
	
	public Meal construct(MealBuilder mb){
		mb.buildFood();
		mb.buildDrink();
		return mb.getMeal();
	}

}
