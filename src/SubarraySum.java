import java.util.ArrayList;

public class SubarraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int a = 0;
        int b = 0;
        int count = 0;
        int get=0;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = i; j < arr.length; j++) {

                count = count+ arr[j];
                if (s == count) {
                    a = i;
                    b = j;
                    get=1;
                    break;
                } else if (count > s) {
                    break;
                }
            }
            if (s == count) {
                break;
            }
        }

        ArrayList<Integer> narr = new ArrayList<>();
        if(get==0){
            narr.add(-1);
        }else{
            narr.add(a+1);
            narr.add(b+1);
        }
        return narr;
    }

    public static void main(String[] args) {

       // int arr[] = {142, 112, 54, 69, 148, 45, 63, 158, 38, 60, 124, 142, 130, 179, 117, 36, 191, 43, 89, 107, 41, 143, 65, 49, 47, 6, 91, 130, 171, 151, 7, 102, 194, 149, 30, 24, 85, 155, 157, 41, 167, 177, 132, 109, 145, 40, 27, 124, 138, 139, 119, 83, 130, 142, 34, 116, 40, 59, 105, 131, 178, 107, 74, 187, 22, 146, 125, 73, 71, 30, 178, 174, 98, 113};
         int  arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(arr.length);
        ArrayList<Integer> result = new ArrayList<>();
        result = subarraySum(arr, arr.length, 15);
        System.out.println(result);
    }
}