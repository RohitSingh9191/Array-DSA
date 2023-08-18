import java.util.ArrayList;

public class SubarryWithKadenAlg {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int csum = arr[0];
        for(int j=1;j<n;j++){
            for (int i = j; i < n; i++) {
                if (csum >= 0 && csum<s) {
                    System.out.println("i= "+i);
                    csum += arr[i];
                    System.out.println(csum);
                }
                if (csum>s) {
                    System.out.println("i2= "+i);
                    csum=arr[i];
                }
                if(csum==s){
                    System.out.println((j)+" "+(i));
                    break;
                }
            }
            if(csum==s){

                break;
            }
        }
        System.out.println(csum);
        return null;
    }
    public static void main(String[] args) {
        //int arr[] = {142, 112, 54, 69, 148, 45, 63, 158, 38, 60, 124, 142, 130, 179, 117, 36, 191, 43, 89, 107, 41, 143, 65, 49, 47, 6, 91, 130, 171, 151, 7, 102, 194, 149, 30, 24, 85, 155, 157, 41, 167, 177, 132, 109, 145, 40, 27, 124, 138, 139, 119, 83, 130, 142, 34, 116, 40, 59, 105, 131, 178, 107, 74, 187, 22, 146, 125, 73, 71, 30, 178, 174, 98, 113};
        int  arr[] = {1,2,3,4,5,6,7,8,9,10};
//int arr[] = {1, 2, 3, 7, 5};
        ArrayList<Integer> result = new ArrayList<>();
        result = subarraySum(arr, arr.length, 15);
      //  System.out.println(result);
    }
}
