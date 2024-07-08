import calc.scientificcalc.*;
public class Demo{
    public static void main(String args[]){
        System.out.println("In class main demo");

        // B obj = new B();
        // B obj2 = new B(5);

        ScientificCalc adv = new ScientificCalc();

        int add = adv.add(50, 3);

        System.out.println("add " + add);

        int sub = adv.sub(20, 8);

        System.out.println("sub " + sub);

        int mul = adv.mul(20, 8);

        System.out.println("mul " + mul);

        int div = adv.div(20, 10);

        System.out.println("div " + div);

        int random = (int)(adv.random());

        System.out.println("random " + random);

        double floor = adv.floor(20.93534645);

        System.out.println("floor " + floor);

        double ceil = adv.ceiling(25.93534645);

        System.out.println("floor " + ceil);

        double power = adv.power(20,2);

        System.out.println("floor " + power);


        //in java multilevel inheritance supports but multiple inheritence does not as in base class same method may be there lets say for B i have 2 parent class A and C and A nad C both have same method y() so when B tries to execute the methody. 
    }
}