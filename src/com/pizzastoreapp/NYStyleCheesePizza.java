package com.pizzastoreapp;

public class NYStyleCheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {

        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("NY Cheese");
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
