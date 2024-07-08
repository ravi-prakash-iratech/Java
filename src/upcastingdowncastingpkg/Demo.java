package upcastingdowncastingpkg;

public class Demo {
    public static void main(String[] args) {
        System.out.println("in main");

        Parent obj = new Child();

        obj.show1();

        Child ch = (Child) obj;

        ch.show2();
        ch.show1();

        Parent par = (Parent) obj;

        //par.show2();
        par.show1();
    }
}
