package FactoryMethod;

/**
 * @author cc
 * @create 2017-08-24-19:25
 */

public class ChicagoPizzaStore extends PizzaStore {
    Pizza pizza = null;

    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        }
        return pizza;
    }
}