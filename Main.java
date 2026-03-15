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
        System.out.println(getHangman(5));
sc.close();
    }
    static String getHangman(int wrongGuiess){
        return switch (wrongGuiess){
            case 0 -> """
                    
                    """;
            case 1 -> """
                    O
                    
                    """;
            case 2 -> """
                    O
                   / \\
                    """;
            case 3 -> """
                    O
                   / \\
                    |
                    """;
            case 4 -> """
                    O
                   / \\
                    |
                   /
                    """;
            case 5 -> """
                     O
                    / \\
                     |
                    / \\
                    """;
            default ->  "" ;
        };
    }
}
