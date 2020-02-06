package exercises;

public class Bread {
    public static void main(String[] args){
        TestBread first = new TestBread(100);
        TestBread second = new TestBread(200, 7.00);
        TestBread third = new TestBread("White", 300, 8.00);

        first.display();
        second.display();
        third.display();

    }
}
