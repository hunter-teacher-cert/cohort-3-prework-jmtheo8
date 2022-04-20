import java.io.*;
import java.util.*;

public class Loop4 {
public static void main(String[] args){
 
int fac = 1; 
int n = 4;

  for(int i = 1; i <= n; i++) { 
  fac = fac * i;
   
}
   System.out.println( "" + n + "!" + "=" + " " + fac);
  }

}