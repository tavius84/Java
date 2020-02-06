package exercises;

public class TestBread {
  private int calories;
  private double price;
  private String breadType;
    public TestBread(String type, int cal, double p){
        calories = cal;
        price = p;
        breadType = type;
    }
    public TestBread(int cal, double p){
        this ("Rye", cal, p);

    }
    public TestBread (int cal){
        this("Wheat", cal, 9.99);
    }
    public void display(){
        System.out.println("Calories " + calories + " . " + price +  " price of the bread. " +
                "type of bread is " +breadType + ".");
    }
}
