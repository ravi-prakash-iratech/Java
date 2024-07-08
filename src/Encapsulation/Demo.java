public class Demo{
    public static void main(String args[]){
        //System.out.println("hey its demo in main method\n Here we will learn encapsulating data\ni.e. binding data with the help of methods so that only \nthrough methods anyone can access or set data. which is encapsulating data\n");

        Human.display();

        //Human.name = "ravi";  //name has private access

        Human.setName("ravi-prakash");
        Human.setAge(30);

        System.out.println("getname " + Human.getName() + " " + Human.getAge());
}
}