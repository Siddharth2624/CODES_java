// This method of reversing an array takes less space complexity.. so consider this method
import java.util.*;
public class reversearr {
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14,16};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void reverse(int arr[]){
        int f=0;
        int l=arr.length-1;
        while(l>=f){
            //swap
            int temp=arr[f];
            arr[f]=arr[l];
            arr[l]=temp;
            l--;
            f++;
        }
    }
}
