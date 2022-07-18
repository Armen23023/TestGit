package SelectSort;

public class SelectSort {
    public void ss(int arr[]) {
        int min;
        int key = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (i != min) {
                key = arr[i];
                arr[i] = arr[min];
                arr[min] = key;
            }
        }
    }
}
