package Singleton;

/**
 * 懒汉式单例模式
 *
 * @author cc
 * @create 2017-08-21-15:18
 *
 */

public class SingletonLazy {
    private static SingletonLazy singleton = null;
    public static synchronized SingletonLazy getInstance(){
        if (singleton == null){
            singleton = new SingletonLazy();
        }
        return singleton;
    }
}
