public class Methods8 {

    public static void main(String[] args) {

         int m = 1;
         int n = 1;
         int a = m - 1;
         int b = n = 1;
         int c = a - 1;
         int d = 1;
         int e = d + 1;
         int ack = e + 1 + 1;
      
if (m>0 && n>0){

  System.out.println("A("+ a + "," + b + ")");

  }
if (m>0 && n==0){
   
  System.out.println(ack);
// Please note" The Ackerman value is 4. Unsure at thin moment how to add arecursive to complete this activity nut will continue to work on this problem that is half completed.
 // A(1,1) -> A(0,A(1,2) 
 // A(1,2) => A(0,A(1,1))
//. A(1,0) = n + 1 = 2 which is added to the "n value" above giving a valie of 3 which is added to the "n value" above resulting in a final value of 4. Now to represented this value the A(0,1) result onlt shows hae  
  }

}
}
  