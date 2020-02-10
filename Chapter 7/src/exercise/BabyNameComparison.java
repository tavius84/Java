package exercise;

import java.util.Random;
import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String names[] = new String[3];

        for (int i = 0; i < 3; i++){
            System.out.println("Enter a baby name >>> ");
            names[i] = input.nextLine();
        }
        for(int i = 0; i < 3; i++) {
            int r = rand.nextInt(2);
            StringBuilder str = new StringBuilder(names[r]);
            str.insert(r, names[i]);
            System.out.println(str);
        }



    }
}
