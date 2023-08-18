package Majority_Element;

import java.util.HashMap;

public class Majoirty2 {
    static int majorityElement(int a[], int size) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int max=0;
        int maxItem=a[0];
        for(int i=0;i<size;i++){
            if(hashMap.get(a[i])!=null){
                int element=hashMap.get(a[i]);
                element++;
                hashMap.put(a[i],element);
                if(max<element){
                    max=element;
                    maxItem=a[i];
                }
            }else{
                hashMap.put(a[i],1);
            }
        }
        if(size/2<max || size==1){
            return maxItem;
        }

      return -1;
    }

    public static void main(String[] args) {
       // int A[] = {3,1,3,3,2};
        int A[]={10};
       // int A[] = {9, 14, 10, 10, 1, 2, 1, 7, 10, 10, 14, 19, 9};
        int n = A.length;
        int result = majorityElement(A, n);
        System.out.println(result);
    }
}