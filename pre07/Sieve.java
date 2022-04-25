import java.io.*;
import java.util.*;

public class Sieve {
public static void main(String[] args){

  int i = 1, notPrime = 0;
  while(i <= n){
  if(n % i == 0){
  notPrime++;
  }
  i++;
  }
  if (notPrime == 2){
  return 1;
  }
   return 0;
  }
}