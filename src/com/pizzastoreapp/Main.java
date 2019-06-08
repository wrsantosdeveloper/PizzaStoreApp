package com.pizzastoreapp;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Crio as fabricas
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        // crio o produto a partir da fabrica passando o tipo
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() +"\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Wallace ordered a " + pizza.getName() + "\n");
    }
}
