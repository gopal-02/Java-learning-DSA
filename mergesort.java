public class mergesort {
    public static void mergeSort(int arr[], int s, int e) {
        if (s >= e)
            return;
        int mid = s + (e - s) / 2;
        mergeSort(arr, s, mid);// lefy
        mergeSort(arr, mid + 1, e);// right
        merge(arr, s, mid, e);
    }
    public static void merge(int arr[], int s, int mid, int e) {
        int temp[] = new int[e - s + 1];
        int i = s;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= e) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= e)
            temp[k++] = arr[j++];
        // copy temp to orignal aray
        for (k = 0, i = s; k < temp.length; k++, i++)
            arr[i] = temp[k];

    }

    // print array code
    public static void printarray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        printarray(arr, n);
    }
}
