public class Largest {
    public static int largest(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
       
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 34, 321, 12, 67 };
        int max =largest(arr);
        System.out.println("The largest number in array is :" + max);
    }
}
