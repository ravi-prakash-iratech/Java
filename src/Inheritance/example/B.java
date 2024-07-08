public class B extends A{
    public B(){
        
        // B obj = new B();
        //In class main demo
        // constructer A without args
        // constructer B without args
        super();                                                        
        System.out.println("constructer B without args");

        // B obj = new B();
        // In class main demo
        // constructer A with args 5
        // constructer B without args
        // super(5);
        // System.out.println("constructer B without args");
    }

    public B(int b){

        //B obj2 = new B(5);
        // In class main demo
        // constructer A without args
        // constructer B with args 5
        // super();
        // System.out.println("constructer B with args " + b);

        // B obj2 = new B(5);
        // In class main demo
        // constructer A without args
        // constructer B with args 5
        // super(b);
        // System.out.println("constructer B with args " + b);


        // In class main demo
        // constructer A without args
        // constructer B without args
        // constructer B with args 5
        //this will execute constructer of same class        
        this();
        System.out.println("constructer B with args " + b);
    }
}