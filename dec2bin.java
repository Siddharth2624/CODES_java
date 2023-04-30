import java.util.*;
class dec{
    public static void main(String args[]){
        System.out.println("Enter a no.");
        Scanner S=new Scanner(System.in);
        int x=S.nextInt();
        int pow=0;
        int dec=0;
        int z=x;
        while(x>0){
            int a=x%2;
            dec=dec+a*(int)Math.pow(10,pow);
            x=x/2;
            pow++;

        }
        System.out.println("Binary conversion of "+z+ " is "+dec);
    }
}