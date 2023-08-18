import java.util.ArrayList;
import java.util.HashMap;

public class SubarraySumByChatgpt {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> narr = new ArrayList<>();
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

        int sum = 0;

        prefixSumMap.put(0, -1); // Initialize the hashmap with a prefix sum of 0 at index -1

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (prefixSumMap.containsKey(sum - s)) {
                int startIndex = prefixSumMap.get(sum - s) + 1;

                int endIndex = i;
                narr.add(startIndex + 1); // Adding 1 to convert from 0-based index to 1-based index
                narr.add(endIndex + 1);
                return narr;
            }

            prefixSumMap.put(sum, i);
        }

        narr.add(-1);
        return narr;
    }

     public static void main(String[] args) {
        int arr[]= {1,2,3,7,5};
       // int arr[] = {142, 112, 54, 69, 148, 45, 63, 158, 38, 60, 124, 142, 130, 179, 117, 36, 191, 43, 89, 107, 41, 143, 65, 49, 47, 6, 91, 130, 171, 151, 7, 102, 194, 149, 30, 24, 85, 155, 157, 41, 167, 177, 132, 109, 145, 40, 27, 124, 138, 139, 119, 83, 130, 142, 34, 116, 40, 59, 105, 131, 178, 107, 74, 187, 22, 146, 125, 73, 71, 30, 178, 174, 98, 113};
        // int  arr[] = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> result = new ArrayList<>();
        int sum=12;
        result = subarraySum(arr, arr.length, sum);
        System.out.println(result);
    }
}