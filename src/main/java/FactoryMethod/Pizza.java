package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * 工厂产品接口
 *
 * @author cc
 * @create 2017-08-24-18:51
 */

/**
 * java类中不写权限修饰符时，本包中的类可以访问。
 */
public abstract class Pizza {
    String name;
    List<String> toppings = new ArrayList<String>();
    public void prepare(){
        System.out.println("Prepareing " + name);
        for ( String line : toppings) {
            System.out.println(" " + line);
        }
    }
    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public String getName(){
        return name;
    }
}
