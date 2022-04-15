import java.io.*;
import java.util.*;

public class Meethods {

public static void main(String[] args){
  
      int n = 1;
      int m = 2;

    if (m == 0)
    {
    return (n + 1);
      }
         else (m > 0 && n == 0); {  
     return (ack(m-1,1));
           }
       else if (m>0 && n>0);
         {
        return (ack(m-1), ack(m,n-1));
           }
         }  

  }
  
