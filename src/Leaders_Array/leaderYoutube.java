package Leaders_Array;

import java.util.ArrayList;

public class leaderYoutube {
    static ArrayList<Integer> leaders(int arr[], int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean itme=true;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                   itme=false;
                   break;
                }
            }
            if(itme==true){
                result.add(arr[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        //int A[] = {16, 17, 4, 3, 5, 2};
        int A[] = {16, 17, 4, 3, 5, 2,56465,5,2,5456,56465,321,25,32,65,2,21,7,213,21,1321,+4,4,21,4,4,321,4,231,5,35,321,654,2,554,31,31,31,4,1,21,54,5,54,4,1,21,212,21};
        //int A[] = {1,2,3,4,0};
        int n =A.length;
        ArrayList result = leaders(A, n);
        System.out.println(result);
    }


}
