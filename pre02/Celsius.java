import java.util.Scanner;

public class Celsius {

    public static void main(String[] args) {

      double cTempVal;
      double fTempVal; 
      final double con = 32;
      Scanner in = new Scanner(System.in);

      System.out.print("Type in a celsius temperature value to get an equivalent farenheight temperature value: ");
        cTempVal = in.nextInt();
        fTempVal = (cTempVal * 9/5) + con;
      
      System.out.printf("%.1f cTempVal = %.1f fTempVal", cTempVal, fTempVal);

      
    }
}