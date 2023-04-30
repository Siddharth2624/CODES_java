import java.util.*;
class sid
{
    public static void main(String args[])
    {
    System.out.println("Enter n and r");
    Scanner S=new Scanner(System.in);
    int n=S.nextInt();
    int r=S.nextInt();
    System.out.println("Binomial coefficient of nCr is "+bincoe(n,r));
} 
public static int fact(int a){
    int f=1;
    for(int i=1;i<=a;i++)
    {
        f=f*i;
    }
    return f;
}
public static int bincoe(int n,int r){
    int a=fact(n);
    int b=fact(r);
    int c=fact(n-r);
    int z=a/(b*c);
    return z;
}
}
