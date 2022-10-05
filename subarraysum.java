public class subarraysum {
    public static void subarray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }

                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6 };
        subarray(array);
    }

}
