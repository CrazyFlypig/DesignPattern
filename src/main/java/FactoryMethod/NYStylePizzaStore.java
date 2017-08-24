package FactoryMethod;

/**
 * 纽约风味披萨店
 *
 * @author cc
 * @create 2017-08-24-19:13
 */

public class NYStylePizzaStore extends PizzaStore{
    Pizza pizza = null;
    Pizza createPizza(String type) {
        if (type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }else if (type.equals("clam")){
            pizza = new NYStyleClamPizza();
        }
        return pizza;
    }
}
