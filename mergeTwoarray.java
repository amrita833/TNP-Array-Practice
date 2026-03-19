import java.util.*;
public class mergeTwoarray {
    public static void main(String[] args) {
         int arr1[]={2,8,4,6};
        int arr2[]={3,7,4,1,9};
       
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            list.add(arr1[i]);
        } for(int i=0;i<arr2.length;i++){
            list.add(arr2[i]);
        }
        list.sort(null);
        System.out.println(list);


            
        
        
    }
    
}
