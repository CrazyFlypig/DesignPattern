package FactoryMethod;

/**
 * 芝加哥口味披萨
 *
 * @author cc
 * @create 2017-08-24-19:05
 */

public class ChicagoStyleClamPizza extends Pizza{
    public ChicagoStyleClamPizza(){
        name = "Chicago Style Pizza";
        toppings.add("add Chicago Clam");
    }
    @Override
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
