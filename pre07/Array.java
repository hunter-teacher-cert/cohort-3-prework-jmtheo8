import java.io.*;
import java.util.*;

public class Array {

public static void main(String[] args){

double[] a = powArray(new double[]{1, 2, 3, 4, 5});

}

public static double[] powArray (double a[]){
       
for (int i = 0; i < a.length; i++) {
  a[i] = Math.pow(a[i], 2.0);
  System.out.println((double)a[i]);
  }
  
return a;
}
}








