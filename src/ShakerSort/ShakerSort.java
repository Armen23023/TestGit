package ShakerSort;

public class ShakerSort {
    public void  SHS(int [] arr){
        int left = 0; int temp;
        int right = arr.length;
        while (left <=right){
            for (int i = right; i > left ; --i) {
                if (arr[i-1]>arr[i]){
                    temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                }
            }
            ++left;
            for (int i = left; i < right ; ++i) {
                if (arr[i]>arr[i+1]){
                    temp = arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1] = temp;
                }
            }
            --right;
        }
    }
}
