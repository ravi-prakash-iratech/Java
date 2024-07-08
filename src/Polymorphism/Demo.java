public class Demo{
    public static void main(String args[]){
        System.out.println("In class main demo");

        Computer comp = new Computer();

        comp.show();

        comp = new Laptop();

        comp.show();

        // comp = new Ship();  //this won't work it works for inherited members only

        // comp.show();
    }
}