package Minimum_number_of_jumps;

public class logic {

    static int minJumps(int[] arr){
        int n=arr.length-1;
        int count=0;
 //       int i=0;
//        while(i<n  && i>=0){
//            count++;
//            i+=arr[i];
//
//            if(count>n){
//                break;
//            }
//            }
//        if(count>n){
//            return -1;
//        }
        int i = 0;
        while(i >= 0 && i < n){
            count++;
            i += arr[i];
        }
        return count;
    }
    public static void main(String[] args) {
        //int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int arr[]= {1, 4, 3, 2, 6, 7};
        int result=minJumps(arr);
        System.out.println(result);

    }
}
