package youDoIt;

public class DemoBlock {
    public static void main(String[] args){
        System.out.println("Demonstrating Block scope");
        int x = 1939;
        System.out.println("In this block x is " + x);
        {
            int y = 1337;
            System.out.println("In this block x is " + x);
            System.out.println("In this block x is " + y);
        }
        {
            int y = 7482;
            System.out.println("In this block x is " + x);
            System.out.println("In this block x is " + y);
            demoMethod();
            System.out.println("After method x is " + x);
            System.out.println("After method block y is " + y);

        }
        System.out.println("At the end x is " + x);
    }
    public static void demoMethod(){
        int x = 80085;
        int y = 5276;
        System.out.println("After method x is " + x);
        System.out.println("After method block y is " + y);
    }
}
