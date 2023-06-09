package 单例;

public class Singleton {
    private Singleton() {
    }

    private static  volatile Singleton instance;    //懒汉式

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
