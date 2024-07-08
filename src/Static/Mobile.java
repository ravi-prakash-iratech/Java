public class Mobile{
    static String name;
    int age;
    String color;

    

    //constructer
    public Mobile(){
        System.out.println("in constructer block");
        //name = "prakash";
        age = 30;
        color = "Red";
    }

    static 
    {
        name = "ravi";
        System.out.println("in static block");
    }

    //non-static method
    public void display(){
        System.out.println("inside display name = " + name + " " + age + " " + color);
        //this.name = n;
    }

    //static method with no arguments
    // public static void display1(){
    //     System.out.println("inside static display name = "  + name); //working fine
    //     //non-staqtic variables cannot be used inside static methods

    //     //System.out.println("inside display name = " + name + " " + age + " " + color); //not working fine
    //     //this.name = n;
    // }

    //static method with arguments as object
    public static void display1(Mobile obj){
        //System.out.println("inside static display name = "  + name); //working fine
        //non-staqtic variables cannot be used inside static methods

        System.out.println("inside display name = " + name + " " + obj.age + " " + obj.color); //now working fine as we can access non-static variables in static methods through its object
        //this.name = n;
    }

    public void show(){
        System.out.println("inside show 1 name = ");
        //this.name = n;
    }

    public void show2(String n){
        System.out.println("inside show 2 name = " + n);
    }
}