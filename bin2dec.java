import java.util.*;
class bin
{
    public static void main(String args[]){
        System.out.println("Enter a binary no.");
        Scanner S = new Scanner(System.in);
        int x=S.nextInt();
        System.out.println("Decimal conversion of "+x+ " is " +bina(x));

    }
    public static int bina(int x){
        int pow=0,b=0;
        while(x>0)
        {
            int l=x%10;
            x=x/10;
            b=b+l*(int)(Math.pow(2,pow));
            pow++;
        }
        return b;
    }
}