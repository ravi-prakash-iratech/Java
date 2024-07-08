public class Human{
    private static String name;
    private static int age;

    public static String getName(){
        return name;
    }

    public static void setName(String n){
        name = n;
    }

    //
    public static int getAge(){
        return age;
    }

    public static void setAge(int a){
        age = a;
    }

    public static void display(){
        System.out.println("Inside Human class");
    }
    
}