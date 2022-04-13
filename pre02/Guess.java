import java.util.Random;
import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {
       
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        final int NUM = 12;
        Scanner in = new Scanner(System.in);
      
      System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is? ");

      System.out.print("Type a number: ");
      number = in.nextInt();
    
      System.out.println("Your guess is: ");
      System.out.print(number + " ");
      
      System.out.println("The number I was thinking of is: ");
      System.out.print(NUM + " ");
      
      System.out.println("You were off by: ");
      System.out.print(number - NUM);
      
    }
}



   
      
     