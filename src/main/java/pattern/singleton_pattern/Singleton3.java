package pattern.singleton_pattern;

/**
 * @author: neojiang
 * @date: 2019/9/26
 * @description: 单例模式 - 懒汉式
 * 优点：
 *      懒加载
 * 缺点：
 *      只能在单线程下使用，多线程会出现多个实例。
 **/
public class Singleton3 {

    // 实例
    private static Singleton3 instance;


    // 私有化构造函数，防止被外部创建
    private Singleton3() {
    }

    // 获取实例的方法
    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

    public static void main(String[] args) {
        singleThead();
    }

    private static void singleThead() {
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

    private static void multiThread() {
        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                System.out.println(Singleton3.getInstance());
            }).start();
        }
    }
}
