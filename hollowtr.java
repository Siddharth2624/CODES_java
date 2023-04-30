import java.util.*;
class hollow{
    public static void main(String args[]){
        System.out.println("Enter no. of rows and column");
        Scanner S=new Scanner(System.in);
        int x=S.nextInt();
        int y=S.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                if(i==1 || j==1 || i==x || j==y)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

