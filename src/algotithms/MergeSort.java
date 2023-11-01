package algotithms;

public class MergeSort {
    public static void sort(int[] array) {
        int n = array.length;
        if(n < 2) {
            return;
        }

        // Find the middle point
        int mid = n / 2;

        // Create left and right arrays
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for(int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        for(int i = mid; i < n; i++) {
            right[i - mid] = array[i];
        }

        sort(left);
        sort(right);

        merge(left, right, array);
    }
    private static void merge(int[] left, int[] right, int[] array) {
        int nL = left.length;
        int nR = right.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nL && j < nR) {
            if(left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            }
            else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < nL) {
            array[k] = left[i];
            i++;
            k++;
        }

        while(j < nR) {
            array[k] = right[j];
            j++;
            k++;
        }
    }
}
