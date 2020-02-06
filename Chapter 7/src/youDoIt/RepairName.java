package youDoIt;

import java.util.Scanner;

public class RepairName {
    public static void main(String[] args){
    String name;
    String saveOrginalname;
    int stringLength;
    char c;

    Scanner input = new Scanner(System.in);

    System.out.print("Please enter your first name >> ");
    name = input.nextLine();

    saveOrginalname = name;

    stringLength = name.length();

    for(int i = 0; i < stringLength; i++){
        c = name.charAt(i);
        if (i==0){
            c = Character.toUpperCase(c);
            name = c + name.substring(1, name.length());
        }
        else
            if(name.charAt(i) == ' '){
            ++i;
            c= name.charAt(i);
            c = Character.toUpperCase(c);
            name = name.substring(0, i) + c +
                    name.substring(i + 1, stringLength);

            }

    }
    }
}
