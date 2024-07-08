package auto_boxingunboxingjob;

public class Test {

    int num = 7;
    Integer n = num;                              //autoboxing we are using primitive data type num and auto boxing it into Integer object n
    public void show(){
        System.out.println("show example = " + n);
    }

    int b = n;                                    //auto-unboxing - it is object n auto unboxes it into integer b
    public void show2(){
        System.out.println("show example == " + b);
    }

    String str = "12";
    int no = Integer.parseInt(str);
    public void show3(){
        System.out.println("show example == " + no);
    }

}
