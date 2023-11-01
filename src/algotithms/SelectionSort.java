package algotithms;

public class SelectionSort {
    public static void sort(int[] array) {
        int n = array.length;
        int temp = 0;
        for(int i = 0; i < n; i++) {
            int min = i;
            for(int j = i + 1; j < n; j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
