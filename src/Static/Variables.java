public class Variables{
    public static void main(String args[]) throws ClassNotFoundException{
        System.out.println("Hi there");

        

        // Variables var = new Variables();
        // Variables var2 = new Variables();

        Mobile mob = new Mobile();

        Mobile mob2 = new Mobile();

        //Static variables can be declared with class name and object too
        // Mobile.name = "ravi";
        // Mobile.name = "prakash";

        mob.display();
        // mob2.display();
        // mob.show("ravi");
        // mob.show("prakash");

        // var.show("ravi");
        // var.show2();
        // var2.show("prakash");
        // var2.show2();

        //in order to start a class
        //Class.forName("Mobile");

        //in order to access static methods we can use class name as of instance variables
        //Mobile.display();

         Mobile.display1(mob2);
    }
}