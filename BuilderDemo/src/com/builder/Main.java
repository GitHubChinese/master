package com.builder;

public class Main {

	public static void main(String[] args) {
		
		Director director = new Director();
		SubMealBuilderA subA = new SubMealBuilderA();
		SubMealBuilderB subB = new SubMealBuilderB();
		
		director.construct(subA);
		
		director.construct(subB);
		
	}

}
