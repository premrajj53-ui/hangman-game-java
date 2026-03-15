import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        String word = " pizza";
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> WordState = new ArrayList<>();
        int wrongGuiess = 0 ;

for (int i=0; i <word.length(); i++)
{
    WordState.add('_');
}
        System.out.println("Welcome to java hangman game!");
sc.close();
    }
}
