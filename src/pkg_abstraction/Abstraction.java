package pkg_abstraction;

public class Abstraction {
    public static void main(String[] args) {
        System.out.println("Example for abstraction");

        Car car = new UpdatedWagonR();

        car.palyMusic();
        car.drive();
        car.fly();
    }
}
