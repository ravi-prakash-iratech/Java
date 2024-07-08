package pkg_interfaces;

public interface A{

    public static int getAge() {
        return age;
    }

    public static String getStr() {
        return str;
    }

    int age = 44;
    String str = "Mumbai";
    void show();
}
