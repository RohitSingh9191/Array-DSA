public class KadenAlgorithrm {
    static void printAllSubarrays(int[] arr) {
        int n = arr.length;
        long csum = arr[0];
        long osum = arr[0];
        for (int i = 0; i < n; i++) {
            if (csum >= 0) {
                csum += arr[i];
            } else {
                csum = arr[i];
            }
            if (csum > osum) {
                osum = csum;
            }
        }
        System.out.println(osum);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, -3, 4, -5, 6, -7, 8, 9, -10};
        printAllSubarrays(arr);
    }
}
