package Singletons;

public class Main {
    public static void main(String[] args) {
        ClassSingleton classSingleton1 = ClassSingleton.getInstance();
        System.out.println("\n" + classSingleton1.getInfo()); //Initial class info

        ClassSingleton classSingleton2 = ClassSingleton.getInstance();
        classSingleton2.setInfo("New class info");

        System.out.println(classSingleton1.getInfo()); //New class info
        System.out.println(classSingleton2.getInfo()); //New class info
        System.out.println(ClassSingleton.getInstance().toString() + "\n");


        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton1.getInfo()); //Initial enum info

        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        enumSingleton2.setInfo("New enum info");

        System.out.println(enumSingleton1.getInfo()); // New enum info
        System.out.println(enumSingleton2.getInfo()); // New enum info

        System.out.println(EnumSingleton.INSTANCE);

    }
}
