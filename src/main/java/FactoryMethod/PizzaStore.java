package FactoryMethod;

/**
 * 抽象披萨店类
 *
 * @author cc
 * @create 2017-08-24-19:09
 */

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.bake();
        pizza.cut();
        pizza.prepare();
        return pizza;
    }
    abstract Pizza createPizza(String type);
}
