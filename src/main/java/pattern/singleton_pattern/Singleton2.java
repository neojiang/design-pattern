package pattern.singleton_pattern;

/**
 * @author: neojiang
 * @date: 2019/9/26
 * @description: 单例模式 - 饿汉式
 *
 * 类实例化的过程是在静态代码块中，在类装载的时候执行静态代码块中的代码，完成类的实例创建。
 *
 * 优点：
 *      写法简单，在类装载的时候就完成实例化，避免线程同步问题，是线程安全的。
 *
 * 缺点：
 *      在类装载的时候就完成实例化，没有达到Lazy Loading的效果。若从始至终从未使用过这个实例，则会造成内存的浪费。
 *
 **/
public class Singleton2 {

    // 实例
    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    // 私有化构造函数，防止被外部创建
    private Singleton2() {
    }

    // 获取实例的方法
    public static Singleton2 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
