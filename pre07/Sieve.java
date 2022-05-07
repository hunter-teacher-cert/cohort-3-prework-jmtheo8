import java.io.*;
import java.util.*;

public class Sieve{
public static void sieve(int n){
    
  boolean primeNum[] = new boolean[n+1];
  
    for(int i=0;i<=n;i++)        
      primeNum[i] = true;
         
        for(int x = 2; x*x <=n; x++){
          if(primeNum[x] == true){
             
           for(int i = x*x; i <= n; i += x)
             primeNum[i] = false;
           }
          }

        for(int i = 2; i <= n; i++){
         if(primeNum[i] == true)
          System.out.print(i + " ");
         }
        }

public static void main(String args[]){
  int n = 74;
    if (true){

  System.out.println("This are all the prime numbers that ");

  System.out.println("are smaller or equal to the number " + n + ":");
        
    Sieve m = new Sieve();
    m.sieve(n);
  }
 }
}