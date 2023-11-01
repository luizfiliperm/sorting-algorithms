package algotithms;

public class InsertionSort {
    public static void sort(int[] array) {
        int n = array.length;
        int temp = 0;
        for(int i = 1; i < n; i++) {
            int j = i;
            while(j > 0 && array[j - 1] > array[j]) {
                temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;
            }
        }
    }
}
