package Singletons;

public enum EnumSingleton {
    INSTANCE("Initial class info");

    private String info;

    private EnumSingleton(String info) {
        this.info = info;
    }

    /*public EnumSingleton getInstance() {
        return INSTANCE;
    }*/

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String newEnumInfo) {
        this.info = newEnumInfo;
    }
}
