import java.util.*;
import java.math.BigInteger;

class S{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int t=S.nextInt();
        S.nextLine(); // consume the end of line character after reading in t
        while(t-- > 0){
            String x=S.nextLine();
            String y=S.nextLine();
            BigInteger n1 = new BigInteger(x);
            BigInteger n2 = new BigInteger(y);
            if(Math.pow(n1.doubleValue(),4) + 4*Math.pow(n2.doubleValue(),2) == 4*Math.pow(n1.doubleValue(),2)*n2.doubleValue())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}