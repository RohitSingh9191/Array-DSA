package Minimum_number_of_jumps;

public class logic2 {

    static int minJumps(int[] arr) {
        int n = arr.length - 1;
        int max=0;
        int maxRange=0;
        int jumps=0;

        for(int i=0;i<n;i++){
            if(max<(i+arr[i])){
                max=i+arr[i];
                System.out.println(max);
            }
            if(maxRange==i){
                maxRange=max;
                jumps++;

                if(maxRange>n-1){
                    return jumps;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        //int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int arr[]= {1, 4, 3, 2, 6, 7};
       // int arr[]={2 ,1 ,0 ,3};
        int result=minJumps(arr);
        System.out.println(result);

    }
}
