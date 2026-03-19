 
import java.util.*;
public class countOccurance {
    public static void main(String[] args) {
        int arr[]={1,5,1,3,6,8,8,4};
        int target=8;
        int count=0;
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
         if(arr[i]==target){
            count++;
         }}
         System.out.println(count);
        


        }
   }
   
