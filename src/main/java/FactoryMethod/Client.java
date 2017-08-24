package FactoryMethod;

/**
 * @author cc
 * @create 2017-08-24-19:45
 */

public class Client {
    public static void main(String[] args) {
        NYStylePizzaStore nn = new NYStylePizzaStore();
        ChicagoPizzaStore cc = new ChicagoPizzaStore();
        Pizza nnPizza = nn.orderPizza("cheese");
        Pizza ccPizza = cc.orderPizza("clam");
        System.out.println("-----------------");
        System.out.println(nnPizza.name);
        System.out.println(ccPizza.name);

    }
}
