package FactoryMethod;

/**
 * @author cc
 * @create 2017-08-24-19:22
 */

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "Chicage Style Cheese Pizza";
        toppings.add("add Chicago Cheese");
    }
    @Override
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
