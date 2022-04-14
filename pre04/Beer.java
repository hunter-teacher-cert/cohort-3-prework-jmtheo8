import java.io.*;
import java.util.*;

public class Beer {
    public static void main(String[] args){
      
      int b = 100; 
      int sub = 1;
  
      while (b > 0) {
        System.out.println( b + " " + "Bottles of beer on the wall." + " " + b + " " + "Bottles of beer." + " " + "Take one down pass it around." + " " + (b - 1) + " " + "Bottles of beer on the wall.");
         
          sub = b - sub;
            b = b - 1;
 } 
        
     System.out.println("No bottles of beer on the wall, no bottles of beer, ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");
 }
}
