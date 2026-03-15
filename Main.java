import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        String word = "pizza";
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> WordState = new ArrayList<>();
        int wrongGuess = 0 ;

for (int i=0; i <word.length(); i++)
{
    WordState.add('_');
}
        System.out.println("Welcome to java hangman game!");

       while (wrongGuess<6){
           System.out.print("WORD: ");
           for (char c: WordState){
               System.out.print(c +" ");
           }
           System.out.println();
           System.out.print("Guess a letter: ");
           char guess =sc.next().toLowerCase().charAt(0);
           if(word.indexOf(guess)>=0){
               System.out.println("CORRECT\n");
               for(int i=0; i<word.length();i++){
                   if (word.charAt(i) == guess){
                       WordState.set(i,guess);
                   }
               }
           }
           else {
               System.out.println("WRONG\n");
               wrongGuess++;
               System.out.println(getHangman(wrongGuess));
           }
       }

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
