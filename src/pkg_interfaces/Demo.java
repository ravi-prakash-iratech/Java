package pkg_interfaces;

public class Demo {
    public static void main(String[] args) {
        System.out.println("in main");

        A obj = new B();

        obj.show();
        obj.show();

        System.out.println("hey" + A.str + " " + A.age);

       // A.str = "Hyder";
    }
}
