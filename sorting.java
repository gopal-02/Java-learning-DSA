public class sorting {
    public static void parr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void bubblesort(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            int z=1;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    z=0;
                }
            }
            if(z==1) break;
        }
    }

    public static void selectionsort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minin = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minin]) {
                    minin = j;
                }
            }
            int t = arr[minin];
            arr[minin] = arr[i];
            arr[i] = t;
        }

    }

    public static void insertionsort2(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j=i-1;
           int temp=arr[i];
           for(;j>=0;j--){
            if(arr[j]>temp){
                arr[j+1]=arr[j];
            }
            else break;
           }
           arr[j+1]=temp;
        }
       

    }

    public static void insertionsort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int min = arr[i];
            while (j >= 0 && arr[j] > min) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = min;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 13, 23, 27, 34 };
        bubblesort(arr);
        parr(arr);
    }
}
