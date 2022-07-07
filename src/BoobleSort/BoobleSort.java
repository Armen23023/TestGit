package BoobleSort;

public class BoobleSort {
    public void bs(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a[j], a[j + 1]);
                }
            }
        }
    }

    private void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
}
