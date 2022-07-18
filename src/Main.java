import BoobleSort.BoobleSort;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int arr[]={10,2,44,2,-1,55,34};
        BoobleSort boobleSort = new BoobleSort();
        boobleSort.bs(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
