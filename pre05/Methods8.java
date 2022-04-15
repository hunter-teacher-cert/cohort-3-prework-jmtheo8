public class Methods8 {

    public static void main(String[] args) {

         int m = 1;
         int n = 2;
         int ack = n, m;
      
        if(m == 0)
        {
            return(n + 1);
        }
       if(m > 0 && n == 0)
        {
            return(ack(m-1,1));
        }
       if(m >0 && n > 0);
        {
            return(ack(m-1)) ack(m,n-1)));
        }

    }
}
