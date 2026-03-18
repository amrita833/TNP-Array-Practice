public class missing{
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int n=arr.length;
        int actualsum=0;
        int N=n+1;
        int totalsum=N*(N+1)/2;
        for(int i=0;i<n;i++){
            actualsum= actualsum+arr[i];

        } int missingno=totalsum-actualsum;
        System.out.println( "Missing no is"+ "--->"+missingno);
    }
}