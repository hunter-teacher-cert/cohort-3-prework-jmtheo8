class Time{
public static void main (String [] args) {
  
  double hour = 12.0;
  double minutes = 30.0;
  double seconds = 10.0;
  
  double numberOfSecondsSinceMidnight = 86400.0 -((24.0 - hour) * 60.0 *    60.0) +   (minutes * 60.0) + seconds;
  
  double numberOfSecondsRemainingInDay = 86400.0 -   
  (numberOfSecondsSinceMidnight);

  double percentOfDayThatPassed =  (numberOfSecondsSinceMidnight) * 100 /   86400;

  
    int hour1 = 14.0;
    int minutes1 = 30.0;
    int seconds1 = 10.0;

    int elapsedTimeSinceStart = numberOfSecondsRemainingInDay - (hour1 * 60 * 60)      + (minutes1 * 60) + seconds1;
  
  
  System.out.println("Number of seconds since midnight: "); 
  System.out.println(numberOfSecondsSinceMidnight + " ");
  
  System.out.println("Number of seconds remaining in day: "); 
  System.out.println(numberOfSecondsRemainingInDay);
  
  System.out.println("Percent of day that passed: "); 
  System.out.println(percentOfDayThatPassed);

     System.out.println("Number of time elapsed in seconds: "); 
     System.out.println(elapsedTimeSinceStart);
  
  }
  
}
