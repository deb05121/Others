package Singletons;

public class ClassSingleton {
    private static ClassSingleton INSTANCE;
    private String info = "Initial info class";

    private ClassSingleton() {
    }

    public static ClassSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ClassSingleton();
        }
        return INSTANCE;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String newClassInfo) {
        this.info = newClassInfo;
    }
}
