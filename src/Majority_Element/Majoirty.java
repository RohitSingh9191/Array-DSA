package Majority_Element;

import java.util.ArrayList;

public class Majoirty {
    static int majorityElement(int a[], int size) {
        ArrayList list = new ArrayList();
        int maj = 1;
        int count = 1;
        int value = a[0];
        for (int i = 0; i < size; i++) {
            count = 1;
            int b = list.indexOf(a[i]);
            if (b >= 0) {
            } else {
                for (int j = i + 1; j < size; j++) {
                    if (a[i] == a[j]) {
                        count++;
                    }
                    list.add(a[i]);
                }
            }
            if (maj < count) {
                maj = count;
                value = a[i];
            }
        }

        if (size / 2 < count) {
            return value;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int A[] = {3,1,3,3,2};
       // int A[] = {9, 14, 10, 10, 1, 2, 1, 7, 10, 10, 14, 19, 9};
        int n = A.length;
        int result = majorityElement(A, n);
        System.out.println(result);
    }
}
//                    if(j>(size/2)+1 && count<=1){
//                        break;
//                    }