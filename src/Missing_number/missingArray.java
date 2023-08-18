package Missing_number;
import java.util.Arrays;
public class missingArray {
    static int miss(int arr[],int n){
        Arrays.sort(arr);

        int m=0;
        for(int i=0;i<n;i++){
            if(i==n-1){
                return n;
            }
            if(i+1!=arr[i]){
                return   m=1+i;
            }
        }
        return m;
    }

    public static void main(String[] args) {
       // int arr[]={1,2,3,5};
       //  int arr[]={6,1,2,8,3,4,7,10,5};
         int arr[]={1};
        // int arr[]= {1 ,2, 3, 5};
        int m=2;
        int result=miss(arr,m);
        System.out.println(result);
    }
}
