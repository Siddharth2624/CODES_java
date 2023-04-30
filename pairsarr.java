import java.util.*;
public class pairsarr {
    public static void main(String args[]){
        int a[]={2,4,6,8,10};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                System.out.print("("+a[i]+","+a[j]+") ");
            }
            System.out.println();
        }
    }
    
}
// Time complexity of this code is O(n^2) as there is a nested loop
