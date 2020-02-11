package YouDoIt;

public class DemoBlock {
    public static void main(String[] args){
        System.out.println("Demonstrating Block Scope");
        int x =1111;
        System.out.println("In this block is " + x);
        {
            int y = 2222;
            System.out.println("In this block is " + x);
            System.out.println("In this block is " + y);

        }
        {
            int y = 3333;
            System.out.println("In this block is " + x);
            System.out.println("In this block is " + y);
            demoMethod();
            System.out.println("After method x is " + x);
            System.out.println("After method block y is " + y);
        }
        System.out.println("At the end x is " + x);
    }
    public static void demoMethod(){
        int x = 8888;
        int y = 9999;
        System.out.println("After method x is " + x);
        System.out.println("After method block y is " + y);
    }
}
