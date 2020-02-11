package exercise;
public class CountMovieSpaces {
    public static void main(String[] args) {
        String aString =
                "You're a wizard harry.";
        int numSpaces = 0;
        int stringLength = aString.length();
        for(int i = 0; i < stringLength; i++ ){
            char ch = aString.charAt(i);
            if(ch == ' '){
                numSpaces++;
            }
        }
        System.out.println("The number of spaces is " + numSpaces);
    }
}
