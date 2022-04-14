import java.io.*;
import java.util.*;

public class Beer {
    public static void main(String[] args){
      
      int b = 99; 
      int sub = 1;
  
      while (b > 0) {
        System.out.println( b + " " + "bottles of beer on the wall." + " " + b + " " + "bottles of beer." + " " + "ya take one down, ya' pass it around," + " " + (b - 1) + " " + "bottles of beer on the wall.");
         
          sub = b - sub;
            b = b - 1;
 } 
        
     System.out.println("No bottles of beer on the wall, no bottles of beer, ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");
 }
}
