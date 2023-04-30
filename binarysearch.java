import java.net.SocketTimeoutException;
import java.util.*;
public class binarysearch {
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14,16};
        int key=10;
        System.out.println("Key found at index " +binarysearch(arr, key));
    }
    public static int binarysearch(int arr[],int key)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(key>arr[mid]){
                start=mid+1;
            }
            else if(key<arr[mid]){
                end=mid-1;
            }
            else if(key==arr[mid]){
                return mid;
            }
            else 
            return -1;

        }
        return end;

    }
}
