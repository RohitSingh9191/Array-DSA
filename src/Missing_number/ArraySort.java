package Missing_number;

public class ArraySort {

    public static void divide(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        } else {
            int mid = si + (ei - si) / 2;
            divide(arr, si, mid);
            divide(arr, mid + 1, ei);
            conqure(arr, si, mid, ei);
        }
    }
    public static void conqure(int arr[], int si, int mid, int ei) {
        int marge[] = new int[ei - si + 1];
        int indx1 = si;
        int indx2 = mid + 1;
        int x = 0;
        while ((indx1 <= mid && indx2 <= ei)) {
            if (arr[indx1] <= arr[indx2]) {
                marge[x++] = arr[indx1++];
            } else {
                marge[x++] = arr[indx2++];
            }
        }
        while (indx1 <= mid) {
            marge[x++] = arr[indx1++];
        }
        while (indx2 <= ei) {
            marge[x++] = arr[indx2++];
        }
        for (int i = 0, j = si; i < marge.length; i++, j++) {
            arr[j] = marge[i];

        }
    }

    public static void main(String[] args) {
        int arr[]={6,1,2,8,3,4,7,10,5};
        int n = arr.length;
        int si = 0;
        int ei = n - 1;
        divide(arr, si, ei);
    }
}
