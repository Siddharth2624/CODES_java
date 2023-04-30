import java.util.*;
public class subarray {
    public static void main(String args[]){
        int a[]={1,-2,6,-1,3};
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        subarr(a);
         sum(a);
        presum(a);
        kadanes(num);
    }
    public static void subarr(int a[]){
        for (int i=0;i<a.length;i++) {
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();


            }
        }
    }// sum of subarray
    public static void sum(int a[]){   //Brute Force
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        int crrsum=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                crrsum=0;
                for(int k=i;k<=j;k++){
                    crrsum=crrsum+a[k];
                }
                if(crrsum>maxsum){
                    maxsum=crrsum;
                    
                    }
                    if(crrsum<minsum){
                        minsum=crrsum;
                       
                    }
                }
            }
            
        System.out.println("Max subarray sum is "+maxsum);
        System.out.println("Min subarray sum is "+minsum);

    }
    //Here, Time complexity is O(n^3) as there are three loops which run till end.
   public static void presum(int a[]){ //In this method of prefix array Time complexity is O(n^2)
    int prefix[]=new int[a.length];
    prefix[0]=a[0];
    //calculate prefix array
    for(int i=1;i<prefix.length;i++){
        prefix[i]=prefix[i-1]+a[i];
    }
    int maxsum=Integer.MIN_VALUE;
    int crrsum=0;
    for(int i=0;i<a.length;i++){
        for(int j=i;j<a.length;j++){
              crrsum=i==0? prefix[j] : prefix[j]-prefix[i-1]; // formula to calculate subarray sum
              if(crrsum>maxsum){
                maxsum=crrsum;
   }
}
    }
System.out.println("max sum is "+maxsum);

}
public static void kadanes(int num[]){  //Time complexity is O(n)
    int ms=Integer.MIN_VALUE; //max sum
    int cs=0; //current sum
    for(int i=0;i<num.length;i++){
        cs=cs+num[i];
        if(cs<0){
            cs=0;
        }
        ms=Math.max(cs,ms);

    }
    System.out.println("Our maximum subarray sum is "+ms);

} /*  This technique fails when we have all -ve elements in an array then just
   find the smallest -ve element.. that will be the maximum subarray sum.*/
}


