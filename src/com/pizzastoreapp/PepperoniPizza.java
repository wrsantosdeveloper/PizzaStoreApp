package com.pizzastoreapp;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
}
