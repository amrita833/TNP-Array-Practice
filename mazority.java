import java.util.*;
public class mazority {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1};
        int n=arr.length;
        int k=n/3;
        
    
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;

                }} if(count>k){
                    System.out.print(arr[i]);
                    break;
                }
            }

        }
        }
    
    

