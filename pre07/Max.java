import java.io.*;
import java.util.*;

public class Max {

public static void main(String[] args) {

int[] counts = new int[100];
for (int score: counts) {
    counts[score]++;
}

    }

    public static int[] histogram ( int scores [] ){
       
for (int i = 0; i < scores.length; i++) {

  System.out.println(scores);
}
    return scores;        

      }
}

//Starting with the code in Section 8.10, write a method called histogram that takes an int array of scores from 0 to (but not including) 100, and returns a histogram of 100 counters. Generalize it to take the number of counters as an argument.
