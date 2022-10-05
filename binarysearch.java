public class binarysearch {
    public static int binaryysearch(int arr[], int key) {
        int s = 0, e = arr.length - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] < key)
                s = mid + 1;
            else
                e = mid - 1;
        }
        return -1;
    }

   

    public static void main(String[] args) {
        /*
         * Scanner sc =new Scanner(System.in);
         * int nums[]=new int[20];
         * imt n=sc.
         * for(int i=0;i<nums.length;i++){
         * nums[i]=sc.nextInt();
         * }
         * System.out.print("Enter key:");
         * int key=sc.nextInt();
         */
        //int nums[] = { 2, 3, 1, 4, 5, 45, 32, 21, 23, 40 };
        int num1[]={1,2,3,4,5,6,7,7,8,8,9};
        int key = 7;
        int index = binaryysearch(num1, key);
        System.out.print(index);
    }
}