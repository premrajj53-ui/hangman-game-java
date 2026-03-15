import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        String filepath ="\\Users\\premr\\OneDrive\\Desktop\\learning _java\\hangman game\\words.txt ";
        ArrayList<String> words = new ArrayList<>();
        try(   BufferedReader reader = new BufferedReader(new FileReader(filepath));) {
            String line;
            while((line = reader.readLine()) != null){
                words.add(line.trim());

            }



        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        }
        catch (IOException e) {
            System.out.println("something went wrong");
        }
        Random random = new Random();

        String word = words.get(random.nextInt(words.size()));

        System.out.println(word);

        /*
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
               if (!WordState.contains('_')){
                   System.out.println(getHangman(wrongGuess));
                   System.out.println("you win");
                   System.out.println( "the word was"+word);
               }
           }
           else {
               System.out.println("WRONG\n");
               wrongGuess++;
               System.out.println(getHangman(wrongGuess));
           }
           if (wrongGuess>=6){
               System.out.println("Game Over! wrong guesses");
               System.out.println( "the word was "+word);
               break;
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
        };*/
    }
}
