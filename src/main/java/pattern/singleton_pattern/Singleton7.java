package pattern.singleton_pattern;

/**
 * @author: neojiang
 * @date:  2019/9/26
 * @description: 单例模式 - 枚举实现
 *
 * JDK1.5以及1.5以上的版本才可以使用。
 *
 * 枚举实现单例模式。避免多线程同步问题，能防止反序列化重新创建新的对象
 *
 * Effective Java作者Josh Bloch提倡的方式
 *
 **/
public class Singleton7 {

    // 私有构造函数
    private Singleton7() {}

    public static Singleton7 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {

        INSTANCE;

        private Singleton7 singleton;

        // JVM保证这个方法绝对只调用一次
        Singleton() {
            singleton = new Singleton7();
        }

        public Singleton7 getInstance() {
            return singleton;
        }
    }

    public static void main(String[] args) {
        Singleton7 instance1 = Singleton7.getInstance();
        Singleton7 instance2 = Singleton7.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}
