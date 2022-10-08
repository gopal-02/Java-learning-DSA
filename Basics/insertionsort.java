public class insertionsort {
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 6, 5, 4, 3 };
        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];
            int j = i - 1;
            while (j >= 0 && cur < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = cur;

        }
        printarray(arr);
    }
}
