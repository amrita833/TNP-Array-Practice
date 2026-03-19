

public class findallduplicate {
    public static void main(String[] args) {
        int arr[]={3,6,3,6,8,9};

        for(int i=0;i<arr.length;i++){
            int count=0;

            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            if(count > 1){

                int k;
                for(k=0;k<i;k++){
                    if(arr[k]==arr[i]){
                        break;
                    }
                }

                if(k == i){   
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

    
    

