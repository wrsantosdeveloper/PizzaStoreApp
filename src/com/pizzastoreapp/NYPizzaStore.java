package com.pizzastoreapp;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {

        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Pizza queijo estilo NY");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("Pizza vegetariana estilo NY");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("Pizza marisco estilo NY");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("Pizza calabresa estilo NY");
        }

        return pizza;
    }
}
